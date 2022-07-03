package com.example

import com.example.data.DrawingServer
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import com.google.gson.Gson

val server = DrawingServer()
val gson = Gson()

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {

        configureSession()
        configureRouting()
        configureSerialization()
        configureSockets()
        configureMonitoring()
    }.start(wait = true)
}
