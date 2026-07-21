package com.edusphere.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI edusphereOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("EduSphere API")
                .description("Smart School ERP backend APIs")
                .version("1.0"));
    }
}
