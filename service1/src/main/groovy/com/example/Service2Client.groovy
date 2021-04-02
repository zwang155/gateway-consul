package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable

@Client(id = "service2")
@CircuitBreaker(delay = "2s", attempts = "1", multiplier = "2", reset = "10s")
@Recoverable(api=Service2.class)
interface Service2Client extends Service2 {

    @Get("/books")
    @Override
    Flowable<ArrayList<Book>> findBooks()

}
