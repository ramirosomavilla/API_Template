package com.ramirosomavilla.API_Template;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API REST template")
                        .version("0.0")
                        .description("Spring Boot && OpenAPI API REST template")
                        .contact(new Contact()
                                .name("Ramiro Somavilla")
                                .email("somavillarami@gmail.com")));
    }
}