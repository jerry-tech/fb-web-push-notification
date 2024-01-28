package com.az.fbpushnotification.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Device(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?=null,

        @Column(nullable = false)
        val name: String,

        @Column(nullable = false)
        val firebaseToken: String,

        @Column(nullable = false)
        val dateCreated: LocalDateTime,

        @Column(nullable = false)
        val lastUpdatedAt: LocalDateTime,

        @Column(nullable = false)
        val deviceId: String,

        @Column(nullable = true)
        val operationSystem: String
)