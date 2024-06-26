import com.android.builder.files.classpathToRelativeFileSet

plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
      }

android {
    namespace = "com.example.cogna"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.example.cogna"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.7.1"))

    // TODO: Add the dependencies for Firebase products you want to use
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")

    implementation ("com.google.firebase:firebase-firestore")

    //autenticação
    implementation("com.google.firebase:firebase-auth:22.3.1")

    implementation("com.google.firebase:firebase-database:19.2.0")

    //implementation for graph
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation ("com.github.lecho:hellocharts-library:1.5.8@aar")



}
