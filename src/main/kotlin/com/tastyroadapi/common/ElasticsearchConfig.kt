package com.tastyroadapi.common

import org.apache.http.HttpHost
import org.elasticsearch.client.RestClient
import org.elasticsearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Configuration
@EnableElasticsearchRepositories
class ElasticsearchConfig (
    @Value("\${spring.elasticsearch.host}")
    var esHost: String,

    @Value("\${spring.elasticsearch.port}")
    var esPort: Int
) {

    @Bean
    fun restHighLevelClient() = RestHighLevelClient(
        RestClient
            .builder(HttpHost(esHost, esPort, "http")))

}