package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.reactivex.Flowable

interface Service2 {

    @Get("/books")
    Flowable<ArrayList<Book>> findBooks()

}
