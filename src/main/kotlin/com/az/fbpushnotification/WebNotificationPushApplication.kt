package com.az.fbpushnotification

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebNotificationPushApplication

fun main(args: Array<String>) {
	runApplication<WebNotificationPushApplication>(*args)
}
