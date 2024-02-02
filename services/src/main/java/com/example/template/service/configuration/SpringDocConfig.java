package com.example.template.service.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @title: Created by trifolium on 2021/8/23.
 * @author: trifolium
 * @date: 2019/3/12 17:41
 * @modified :
 */
@Configuration
@Profile({"dev", "test", "uat"})
public class SpringDocConfig {

    @Bean
    public OpenAPI myOpenAPI(@Value("${application-description}")
                             String appDescription,
                             @Value("${application-version}")
                             String appVersion) {
        return new OpenAPI().info(new Info()
                .title("template接口文档")
                .description(appDescription)
                .version(appVersion)
                .contact(new Contact()
                        .name("trifolium.wang")
                        .email("trifolium.wang@foxmail.com")
                        .url("https://github.com/trifolium-wang"))
        );
    }


}
