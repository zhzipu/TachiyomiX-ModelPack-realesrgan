plugins {
    id("com.android.application") version "9.2.1"
}

android {
    namespace = "com.tachiyomix.modelpack.realesrgan"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.tachiyomix.modelpack.realesrgan"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"
        manifestPlaceholders["modelpackId"] = "realesrgan"
        manifestPlaceholders["modelpackName"] = "Real-ESRGAN 模型"
    }

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }

    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }
}
