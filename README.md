# Compose Article

A static article screen: a header image, a title and two paragraphs of text about Jetpack Compose.

Built while following Google's [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course) course (the "Compose article" practice problem).

## Features

- Banner image, title and justified paragraphs
- Edge-to-edge layout with safe-drawing padding

## Built with

- Kotlin, Jetpack Compose, Material 3
- Small reusable composables (`BackgroundImage`, `TitleText`, `ParagraphText`)
- Min SDK 24, target/compile SDK 35

## Run it

1. Open the project folder in Android Studio and let Gradle sync.
2. Run the `app` configuration on an emulator or device (Android 7.0 / API 24 or newer).

Or, with a device or emulator connected:

```sh
./gradlew installDebug
```
