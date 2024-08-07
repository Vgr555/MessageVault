package com.example.service

import com.datastax.oss.driver.api.core.CqlSession
import com.example.entity.Message
import jakarta.inject.Singleton
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

@Singleton
class SaveToDB(private val session : CqlSession) {

    fun saveMessage(message:String){
        val query = "INSERT INTO test.messages (id, message, messageReceivedAt) VALUES (?, ?, ?)"
        val id = UUID.randomUUID()
        val now = LocalDateTime.now().toInstant(ZoneOffset.UTC)
        session.execute(
            session.prepare(query).bind(id, message, now)
        )
    }

}