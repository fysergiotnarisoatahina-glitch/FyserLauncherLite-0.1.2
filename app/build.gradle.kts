plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.fyser.launcher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.fyser.launcher"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "0.1.0"
    }

    kotlinOptions { jvmTarget = "17" }
}
