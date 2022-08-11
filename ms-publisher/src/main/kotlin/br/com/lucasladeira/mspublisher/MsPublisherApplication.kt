package br.com.lucasladeira.mspublisher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsPublisherApplication

fun main(args: Array<String>) {
	runApplication<MsPublisherApplication>(*args)
}
