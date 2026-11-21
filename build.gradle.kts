
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(ktorLibs.plugins.ktor)
    alias(libs.plugins.kotlin.serialization)
}

group = "moe.louise"
version = "1.0.0-SNAPSHOT"

application {
    mainClass = "moe.louise.MainKt"
}

kotlin {
    jvmToolchain(21)
}

sourceSets {
    main {
        kotlin.setSrcDirs(listOf("backend/main/kotlin"))
        resources.setSrcDirs(listOf("backend/main/resources"))
    }
    test {
        kotlin.setSrcDirs(listOf("backend/test/kotlin"))
        resources.setSrcDirs(listOf("backend/test/resources"))
    }
}

dependencies {
    implementation(ktorLibs.serialization.kotlinx.json)
    implementation(ktorLibs.server.auth)
    implementation(ktorLibs.server.callId)
    implementation(ktorLibs.server.callLogging)
    implementation(ktorLibs.server.contentNegotiation)
    implementation(ktorLibs.server.core)
    implementation(ktorLibs.server.cors)
    implementation(ktorLibs.server.netty)
    implementation(libs.exposed.core)
    implementation(libs.exposed.r2dbc)
    implementation(libs.h2database.h2)
    implementation(libs.h2database.r2dbc)
    implementation(libs.koin.ktor)
    implementation(libs.koin.loggerSlf4j)
    implementation(libs.logback.classic)

    testImplementation(kotlin("test"))
    testImplementation(ktorLibs.server.testHost)
}
