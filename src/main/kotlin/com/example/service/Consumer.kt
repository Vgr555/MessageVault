package com.example.service

import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import jakarta.inject.Singleton

@Singleton
@KafkaListener
class Consumer(private val saveToDB: SaveToDB) {

    @Topic("message")
    fun receiveMessage(message: String){
        saveToDB.saveMessage(message)
        print("Message received -> $message")

    }

}