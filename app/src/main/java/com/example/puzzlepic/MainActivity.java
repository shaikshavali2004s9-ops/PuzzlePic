package com.example.puzzlepic;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends Activity {

    private static final int PICK_IMAGE = 1001;

    private PuzzleView puzzleView;
    private TextView infoText;
    private Bitmap originalBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(16, 20, 16, 16);
        root.setBackgroundColor(Color.rgb(18, 18, 28));

        TextView title = new TextView(this);
        title.setText("🧩 PuzzlePic");
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 15);

        root.addView(title);

        infoText = new TextView(this);
        infoText.setText("Moves: 0    Time: 0s");
        infoText.setTextColor(Color.WHITE);
        infoText.setTextSize(18);
        infoText.setGravity(Gravity.CENTER);
        infoText.setPadding(0, 10, 0, 10);

        root.addView(infoText);

        puzzleView = new PuzzleView();

        LinearLayout.LayoutParams puzzleParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                );

        root.addView(puzzleView, puzzleParams);

        LinearLayout row1 = new LinearLayout(this);
        row1.setOrientation(LinearLayout.HORIZONTAL);

        Button galleryButton = new Button(this);
        galleryButton.setText("🖼 Gallery");

        Button shuffleButton = new Button(this);
        shuffleButton.setText("🔀 Shuffle");

        row1.addView(galleryButton,
                new LinearLayout.LayoutParams(0, 60, 1));
        row1.addView(shuffleButton,
                new LinearLayout.LayoutParams(0, 60, 1));

        root.addView(row1);

        LinearLayout row2 = new LinearLayout(this);
        row2.setOrientation(LinearLayout.HORIZONTAL);

        Button hintButton = new Button(this);
        hintButton.setText("💡 Hint");

        Button resetButton = new Button(this);
        resetButton.setText("🔄 Reset");

        row2.addView(hintButton,
                new LinearLayout.LayoutParams(0, 60, 1));
        row2.addView(resetButton,
                new LinearLayout.LayoutParams(0, 60, 1));

        root.addView(row2);
            }
    }
