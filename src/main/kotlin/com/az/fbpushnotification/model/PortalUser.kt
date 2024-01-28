package com.az.fbpushnotification.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class PortalUser (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val firstName: String,

    @Column(nullable = false)
    val lastName: String,

    @Column(nullable = true)
    val username: String,

    @Column(nullable = true, unique = true)
    val email: String,

    @Column(nullable = false)
    val dateCreated: LocalDateTime,

    @Column(nullable = false)
    val lastUpdatedAt: LocalDateTime,

    @Column(nullable = true)
    val password: String,//Will be using keycloak for authentication.

    @Column(nullable = false, unique = true)
    val userId: String
)
