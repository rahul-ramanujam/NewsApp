/**
 *
 *
 */
object Dependencies {

    val coreKtx by lazy {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val androidXLifecycle by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidX}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val androidxCompose by lazy { "androidx.compose:compose-bom:${Versions.androidxCompose}" }

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltAndroidcompiler by lazy {"com.google.dagger:hilt-android-compiler:${Versions.hilt}"}
    val hiltCompiler by lazy {"androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"}

    val hiltNavigationCompose by lazy {"androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"}

    val retrofit by lazy {  "com.squareup.retrofit2:retrofit:${Versions.retrofit}"}
    val okhttp by lazy {  "com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
    val gsonConverter by lazy {  "com.squareup.retrofit2:retrofit:${Versions.gsonConverter}"}
    val moshi by lazy {"com.squareup.moshi:moshi-kotlin:${Versions.moshi}"}
    val moshiConverter by lazy {"com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}"}
    val loggingInterceptor by lazy {"com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"}

    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val coroutinesAndroid by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"}

    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}" }
    val coil by lazy {"io.coil-kt:coil-compose:${Versions.coil}"}
}