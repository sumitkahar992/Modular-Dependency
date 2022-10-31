package dependencies
internal object Dependencies {


    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"

    const val kotlinStandardLibraryJdk8 =
        "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"


    // dependencies.getCoreAndroidDependencies
    const val androidCoreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val androidAppCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val androidMultiDex = "androidx.multidex:multidex:${Versions.multidex}"


    // dependencies.getGoogleAndroidLibraries
    const val playServicesAds =
        "com.google.android.gms:play-services-ads:${Versions.playServicesAds}"
    const val googleMaps = "com.google.maps.android:android-maps-utils-v3:1.3.1"
    const val playServicesMaps =
        "com.google.android.gms:play-services-maps:${Versions.playServicesMaps}"


    // dependencies.getComposeOfficialDependencies
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeMaterial3 = "androidx.compose.material3:material3:${Versions.material3}"
    const val composeMaterialIconsExtended =
        "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val composeRuntimeLivedata =
        "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    const val composeConstraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayoutCompose}"
    const val composePaging = "androidx.paging:paging-compose:${Versions.pagingCompose}"
    const val composeViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleViewModelCompose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"

    const val composeUiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"

    /**
     * Custom fling behaviour
     * refer to https://github.com/iamjosephmj/flinger for more insights on the library
     */
    const val flinger = "com.github.iamjosephmj:flinger:${Versions.flinger}"
    const val composeLottie = "com.airbnb.android:lottie-compose:${Versions.lottie}"
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
    const val fontAwesomeCompose =
        "com.github.Gurupreet:FontAwesomeCompose:${Versions.fontAwesomeCompose}"


    // dependencies.getDataDependencies
    const val androidPagingRuntime = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"


    const val androidExoPlayer = "com.google.android.exoplayer:exoplayer:${Versions.exoplayer}"

    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coilCompose}"




    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiterApi}"
    const val junitJupiterEngine =
        "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiterEngine}"
    const val truth = "com.google.truth:truth:${Versions.truth}"
    const val kotlinJunit5 = "org.jetbrains.kotlin:kotlin-test-junit5:${Versions.kotlin}"
    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
    const val androidXJunit = "androidx.test.ext:junit:${Versions.androidXJunit}"

    const val biometric = "androidx.biometric:biometric:${Versions.biometric}"




    // Test
    const val junit = "junit:junit:${Versions.testImplJunit}"
    const val androidTest = "androidx.test.ext:junit:${Versions.androidTestImplJunit}"
    const val expresso = "androidx.test.espresso:espresso-core:${Versions.androidTestExpresso}"


    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val scalersConvertors =
        "com.squareup.retrofit2:converter-scalars:${Versions.scalerConvertor}"

    // Networking dependencies.Dependencies
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val okHttpGsonConverter =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofitConverterGson}"


    // Kotlin Coroutine
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"



    const val androidPaletteKtx = "androidx.palette:palette-ktx:${Versions.paletteKtx}"
    const val googleMaterial = "com.google.android.material:material:${Versions.material}"

    // Coroutine LifecycleScope
    const val viewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidLifecycleGrouped}"
    const val liveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidLifecycleGrouped}"
    const val lifecycleRuntimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidLifecycleGrouped}"
    const val lifecycleSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.androidLifecycleGrouped}"


    // Dagger-Hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.dagger}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"


    // CircularProgressBar
    const val swipeRefresh =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"



}