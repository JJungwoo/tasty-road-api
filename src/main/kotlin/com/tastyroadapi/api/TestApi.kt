package com.tastyroadapi.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(description = "테스트 API")
class TestApi {

    @RequestMapping("/test")
    @ApiOperation("테스트 용도 API")
    fun test(): String = "test"
}