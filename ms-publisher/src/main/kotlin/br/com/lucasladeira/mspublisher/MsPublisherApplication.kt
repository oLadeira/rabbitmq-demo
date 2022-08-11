package br.com.lucasladeira.mspublisher

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableRabbit
class MsPublisherApplication

fun main(args: Array<String>) {
	runApplication<MsPublisherApplication>(*args)
}
