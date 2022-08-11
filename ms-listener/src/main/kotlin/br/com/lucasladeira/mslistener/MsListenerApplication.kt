package br.com.lucasladeira.mslistener

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableRabbit
class MsListenerApplication

fun main(args: Array<String>) {
	runApplication<MsListenerApplication>(*args)
}
