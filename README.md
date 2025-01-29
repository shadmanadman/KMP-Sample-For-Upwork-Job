This is a Kotlin Multiplatform project targeting Android, iOS, Web.

this is a simple poject for an upwork job post. 
- I used Kamel to load url image
- I used kotlin-serialization to decode json
- I used ktor-http client for networking

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.
