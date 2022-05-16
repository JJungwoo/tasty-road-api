package com.tastyroadapi.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi {

    @RequestMapping("/test")
    fun test(): String = "test"
}