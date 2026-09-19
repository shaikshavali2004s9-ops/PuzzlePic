# PuzzlePic Android App

Image Jigsaw Puzzle app for Android.

## Features
- Gallery image selection
- Demo puzzle
- 3x3 default puzzle
- Shuffle
- Hint
- Timer
- Moves and score
- Completion dialog

## Build APK
1. Open this project in Android Studio.
2. Let Gradle sync.
3. Select Build > Build APK(s).
4. APK will be under `app/build/outputs/apk/debug/`.

To add 4x4/5x5/6x6 selection, extend the Home screen buttons and set `grid` before calling `startGame()`.
