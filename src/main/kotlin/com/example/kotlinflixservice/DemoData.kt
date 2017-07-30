package com.example.kotlinflixservice

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.util.*
import javax.annotation.PostConstruct

@Component
class DemoData(val repo: MovieRepository) {
    @PostConstruct
    fun run() {
        repo.deleteAll()
                .thenMany(
                        Flux.just("Enter the Mono<Void>", "Y Tu Mono Tambien")
                                .map { title -> Movie(UUID.randomUUID().toString(), title) }
                                .flatMap { t -> repo.save(t) })
                .subscribe { t -> println(t) }
    }
}
