package com.az.fbpushnotification.repository

import com.az.fbpushnotification.model.Device
import org.springframework.data.jpa.repository.JpaRepository

interface DeviceRepository : JpaRepository<Device, Long>{
}