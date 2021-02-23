package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Flowable

@Client(id = "service2")
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}