package br.com.lucasladeira.mspublisher.publishers

import br.com.lucasladeira.mspublisher.config.MQConfig
import br.com.lucasladeira.mspublisher.entities.Cliente
import com.google.gson.Gson
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Component

@Component
class ExamplePublisher(
    val queueExample: Queue,
    val rabbitTemplate: RabbitTemplate,
    val gson: Gson
) {


    fun publishExample(payload: Cliente){
        val json = gson.toJson(payload)
        rabbitTemplate.convertAndSend(queueExample.name, json)
    }

}