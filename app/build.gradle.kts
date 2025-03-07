plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.thequizapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.thequizapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures{
        dataBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    val lifecycle_version = "2.8.7"

    // ViewModel
    implementation(libs.lifecycle.viewmodel)

    // LiveData
    implementation(libs.lifecycle.livedata)

    // Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)

}