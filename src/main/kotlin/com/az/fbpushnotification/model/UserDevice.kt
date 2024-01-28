package com.az.fbpushnotification.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class UserDevice(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,

        @ManyToOne(fetch = FetchType.LAZY)
        val portalUser: PortalUser? = null,

        @ManyToOne(fetch = FetchType.LAZY)
        val device: Device? = null,

        @Column(nullable = false)
        val dateCreated: LocalDateTime,

        @Column(nullable = false)
        val lastUpdatedAt: LocalDateTime,
)