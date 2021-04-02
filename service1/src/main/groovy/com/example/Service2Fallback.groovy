package com.example

import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable

@Fallback
@Recoverable
class Service2Fallback implements Service2{

    @Override
    Flowable<ArrayList<Book>> findBooks() {
        Book book = new Book(title: "No Response from Service 2", author: "will be back shortly", isbn: "1234567890")

        Flowable.just([book])
    }

}
