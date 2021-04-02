package com.example.gateway.rest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import reactor.core.publisher.Mono

@RestController
class HystrixFallbackRestController {

    @GetMapping("/api/fallback")
    Mono<String> getSvc1Msg() {
        return Mono.just("No response from Service 1 and will be back shortly")
    }

}