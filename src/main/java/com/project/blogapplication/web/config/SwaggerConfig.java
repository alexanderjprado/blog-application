package com.project.blogapplication.web.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("blog-application")
                .pathsToMatch("/blog/**")
                .build();
    }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Blog Application")
                        .description("API REST para la gestión de POST en un blog")
                        .version("v0.0.1")
                        .license(new License().name("Licencia de API").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("By: alexanderjprado")
                        .url("https://github.com/alexanderjprado/"));
    }
}
