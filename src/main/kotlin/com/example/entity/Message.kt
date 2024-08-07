package com.example.entity

import com.datastax.oss.driver.api.mapper.annotations.Entity
import com.fasterxml.jackson.annotation.JsonIgnore
import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable
import java.time.Instant
import java.util.UUID

@Entity
@Introspected
@Serdeable
data class Message(

    val id : UUID? = null,
//    val key : String,
    val message : String,
    val messageReceivedAt : Instant? = null
)
