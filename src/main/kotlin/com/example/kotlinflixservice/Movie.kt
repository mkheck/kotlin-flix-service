package com.example.kotlinflixservice

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Movie(@Id val id: String, val title: String)