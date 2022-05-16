package com.tastyroadapi.common

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun productApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .apiInfo(this.metaInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.tastyroadapi"))
            .paths(PathSelectors.any())
            .build();
    }

    private fun metaInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("Tasty Road API 문서")
            .description("맛집 검색 API 문서입니다.")
            .version("1.0.0")
            .build()
    }
}