package com.example.plugins

import com.example.session.DrawingSession
import io.ktor.server.application.*
import io.ktor.server.application.ApplicationCallPipeline.ApplicationPhase.Plugins
import io.ktor.server.sessions.*
import io.ktor.util.*

fun Application.configureSession() {
    install(Sessions) {
        cookie<DrawingSession>("SESSION")
    }
    intercept(Plugins) { //will be executed when every client makes a request to server
        if(call.sessions.get<DrawingSession>() == null) {
            val clientId = call.parameters["clientId"] ?: ""
            call.sessions.set(DrawingSession(clientId, generateNonce()))
        }
    }
}