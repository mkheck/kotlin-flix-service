package com.example.kotlinflixservice

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.util.*

@Component
class DemoData(val repo: MovieRepository) {
    fun run() {
        repo.deleteAll().block()

        Flux.just("Enter the Mono<Void>", "Y Tu Mono Tambien")
                .map { title -> Movie(UUID.randomUUID().toString(), title) }
                .flatMap { t: Movie? -> repo.save(t)}
                .subscribe { t: Movie? -> println(t)}
//                .subscribe(System.out::println)
    }
}
