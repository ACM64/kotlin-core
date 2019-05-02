object AppConfig {
    const val id = "uk.acm64"
    const val versionName = "0.1"
    const val versionCode = 1

    object Publish {
        const val group = "uk.acm64.kotlin"
        const val name = "core"
        const val version = "0.1"

    }
}

object StoreDebug {
    const val storePath = "../signing/debug.keystore"
    const val storePassword = "android"
    const val keyAlias = "androiddebugkey"
    const val keyPassword = "android"
}