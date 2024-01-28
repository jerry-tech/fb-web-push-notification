package com.az.fbpushnotification.repository

import com.az.fbpushnotification.model.UserDevice
import org.springframework.data.jpa.repository.JpaRepository

interface UserDeviceRepository : JpaRepository<UserDevice, Long>{
}