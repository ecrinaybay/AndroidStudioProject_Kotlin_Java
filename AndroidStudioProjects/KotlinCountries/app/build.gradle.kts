plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.devtools.ksp")

}

android {
    namespace = "com.ecrinaybay.kotlincountries"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ecrinaybay.kotlincountries"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    dataBinding {
        enable = true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    val lifeCycleExtensionVersion = "1.1.1"
    val supportVersion = "28.0.0"
    val retrofitVersion = "2.9.0"
    val glideVersion = "4.16.0"
    val rxJavaVersion = "2.2.21"
    val roomVersion = "2.5.2"
    val navVersion = "2.7.1"
    val preferencesVersion = "1.2.1"

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("android.arch.lifecycle:extensions:$lifeCycleExtensionVersion")

    implementation ("androidx.room:room-runtime:$roomVersion")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0" )
    //kapt ("androidx.room:room-compiler:$roomVersion")
    //ksp("androidx.room:room-compiler:$roomVersion")
    implementation ("androidx.room:room-ktx:$roomVersion")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    implementation ("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation ("androidx.navigation:navigation-ui-ktx:$navVersion")

    implementation ("com.google.android.material:material:1.9.0")

    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")

    implementation ("io.reactivex.rxjava2:rxjava:$rxJavaVersion")
    implementation ("io.reactivex.rxjava2:rxandroid:2.1.1")

    implementation ("com.github.bumptech.glide:glide:$glideVersion")


    implementation ("com.android.support:palette-v7:$supportVersion")
    implementation ("com.android.support:design:$supportVersion")

    implementation ("androidx.preference:preference:$preferencesVersion")


}








































