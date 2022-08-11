package br.com.lucasladeira.mspublisher.services

import br.com.lucasladeira.mspublisher.entities.Cliente
import br.com.lucasladeira.mspublisher.publishers.ExamplePublisher
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

@Service
class ExampleService(
    private val examplePublisher: ExamplePublisher
) {

    fun publicaClienteFila(cliente: Cliente){
        examplePublisher.publishExample(cliente)
    }

}