object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val kotlinBom by lazy {"org.jetbrains.kotlin:kotlin-bom:${Versions.kotlinBom}"}
    val runtimeKtx by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKtx}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUI by lazy {"androidx.compose.ui:ui"}
    val composeUIGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val composePreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial by lazy {"androidx.compose.material3:material3"}
    val junit by lazy {"junit:junit:${Versions.junit}"}
    val espressoCore by lazy {"androidx.test.espresso:espresso-core:${Versions.espressoCore}"}
    val composeBom2 by lazy {"androidx.compose:compose-bom:${Versions.composeBom2}"}
    val composeJunit by lazy {"androidx.compose.ui:ui-test-junit4"}
    val extJunit by lazy {"androidx.test.ext:junit:${Versions.extJunit}"}
    val composeUITool by lazy {"androidx.compose.ui:ui-tooling"}
    val composeUITest by lazy {"androidx.compose.ui:ui-test-manifest"}
    val material by lazy {"com.google.android.material:material:${Versions.material}"}
    val appcompact by lazy {"androidx.appcompat:appcompat:${Versions.appcompact}"}
}

object Modules{
    const val utilities = ":utilities"
}