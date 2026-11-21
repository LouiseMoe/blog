package moe.louise

import io.ktor.server.application.Application

suspend fun Application.rootModule() {
    configureExposed()
    configureKoin()
    configureHttp()
    configureMonitoring()
    configureSerialization()
    configureSecurity()
    configureRouting()
}
