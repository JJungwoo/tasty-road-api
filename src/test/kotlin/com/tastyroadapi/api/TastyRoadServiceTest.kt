package com.tastyroadapi.api

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class TastyRoadServiceTest {

    @Autowired
    lateinit var tastyRoadService: TastyRoadService

    @Test
    fun test1() {
        tastyRoadService.test()
    }
}