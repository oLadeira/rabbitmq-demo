package br.com.lucasladeira.mspublisher.controllers

import br.com.lucasladeira.mspublisher.entities.Cliente
import br.com.lucasladeira.mspublisher.services.ExampleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("test")
class ExampleController(
    private val exampleService: ExampleService
) {

    @PostMapping("/publica-cliente")
    fun publicaClienteFila(@RequestBody cliente: Cliente): ResponseEntity<Void>{
        exampleService.publicaClienteFila(cliente)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

}