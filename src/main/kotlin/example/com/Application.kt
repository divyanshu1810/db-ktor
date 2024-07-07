package example.com

import example.com.plugins.*
import io.ktor.server.application.*
import example.com.model.PostgresTaskRepository

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val repository = PostgresTaskRepository()
    configureSerialization(repository)
    configureDatabases()
    configureRouting()
}
