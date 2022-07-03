package com.example.plugins

import com.example.routes.createRoomRoute
import com.example.routes.gameWebSocketRoute
import com.example.routes.getRoomRoute
import com.example.routes.joinRoomRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    install(Routing) {
        createRoomRoute()
        getRoomRoute()
        joinRoomRoute()
        gameWebSocketRoute()
    }
}
