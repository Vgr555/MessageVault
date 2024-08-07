package com.example.controller

import com.example.entity.Message
import com.example.service.Producer
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller
class SampleController(private val producer : Producer) {

    @Get("/hello")
    fun helloWorld() : String{
        return "Hello World!"
    }

    @Post("/message")
    fun sendMessage(@Body message : Message){
        producer.sendMessage(message.message)
    }

}