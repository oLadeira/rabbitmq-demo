package br.com.lucasladeira.mslistener.listeners

import br.com.lucasladeira.mslistener.responses.Cliente
import com.google.gson.Gson
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class ExampleListener(
    private val gson: Gson
) {
    private val log = LoggerFactory.getLogger(ExampleListener::class.java)

    @RabbitListener(queues = ["\${mq.queues.example-queue}"])
    fun recebeMensagem(@Payload payload: String){
        val cliente = gson.fromJson(payload, Cliente::class.java)
        log.info(cliente.email)
    }
}