package com.example.service

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.Topic
import jakarta.inject.Singleton

@Singleton
@KafkaClient
interface Producer {
    @Topic("message")
    fun sendMessage(message:String)
}