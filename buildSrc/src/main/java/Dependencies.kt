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
    val hiltAndroidcompiler by lazy {"com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}"}
    val hiltCompiler by lazy {"com.google.dagger:hilt-compiler:${Versions.hilt}"}
    val hiltNavigationCompose by lazy {"androidx.navigation:navigation-compose:${Versions.hiltNavigationCompose}"}

}