package com.example.kotlinflixservice

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface MovieRepository : ReactiveMongoRepository<Movie, String> {}