package ru.nb.medalist.msmserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MsmServerApplication

fun main(args: Array<String>) {
	runApplication<MsmServerApplication>(*args)
}
