package com.tastyroadapi.api

import org.elasticsearch.client.RequestOptions
import org.elasticsearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TastyRoadService {

    @Autowired
    lateinit var restHighLevelClient: RestHighLevelClient

    fun test() {
        println("ping : ${restHighLevelClient.ping(RequestOptions.DEFAULT)}")
        val res = restHighLevelClient.info(RequestOptions.DEFAULT)

        println("version : ${res.version}")
        println("nodeName : ${res.nodeName}")
    }
}