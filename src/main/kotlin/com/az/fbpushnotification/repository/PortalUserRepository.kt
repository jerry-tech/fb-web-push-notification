package com.az.fbpushnotification.repository

import com.az.fbpushnotification.model.PortalUser
import org.springframework.data.jpa.repository.JpaRepository

interface PortalUserRepository : JpaRepository<PortalUser, Long>{
}