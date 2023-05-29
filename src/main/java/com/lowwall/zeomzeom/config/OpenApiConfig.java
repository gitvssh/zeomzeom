package com.lowwall.zeomzeom.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class OpenApiConfig {
    private static final String API_TITLE = "ZeomZeom API";
    private static final String API_VERSION = "1.0";
    private static final String API_Description = "ZeomZeom API 명세서";

    @Bean
    public OpenAPI openAPI() {

        Info info = new Info()
                .version(API_VERSION)
                .title(API_TITLE)
                .description(API_Description);

        return new OpenAPI()
                .info(info);
    }

}
