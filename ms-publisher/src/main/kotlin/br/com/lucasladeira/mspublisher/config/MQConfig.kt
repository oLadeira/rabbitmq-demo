package br.com.lucasladeira.mspublisher.config

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MQConfig {

    @Value("\${mq.queues.example-queue}")
    private lateinit var queueName: String

    @Bean
    fun queueExample(): Queue{
        return Queue(queueName,true)
    }
}