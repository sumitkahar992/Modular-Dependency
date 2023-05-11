import configurations.ProjectConfigs
import dependencies.*

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")

}

android {
    namespace = "com.example.modulardependency"
    compileSdk = ProjectConfigs.compileSdkVersion

    defaultConfig {
        applicationId = ProjectConfigs.applicationId
        minSdk = ProjectConfigs.minSdkVersion
        targetSdk = ProjectConfigs.targetSdkVersion
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    kapt {
        correctErrorTypes = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectConfigs.kotlinCompilerExtensionVersion
    }
    packagingOptions {
        resources.excludes.apply {
            add("META-INF/AL2.0")
            add("META-INF/LGPL2.1")
        }
    }

    configurations { implementation.get().exclude(mapOf("group" to "org.jetbrains", "module" to "annotations")) }
}



dependencies {

    addComposeOfficialDependencies()

}