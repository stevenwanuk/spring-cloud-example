package com.sven.sc.ms.bookstore.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("Book Store API").description("Documentation BookS tore API v1.0").build());
    }

    @Bean
    public WebMvcConfigurer useSwaggerAsRootPage()
    {
        return new WebMvcConfigurer()
        {
            public void addViewControllers(ViewControllerRegistry registry)
            {
                // forward root request to swagger welcome page
                registry.addViewController("/").setViewName("redirect:/swagger-ui.html");
            }
        };
    }
}
