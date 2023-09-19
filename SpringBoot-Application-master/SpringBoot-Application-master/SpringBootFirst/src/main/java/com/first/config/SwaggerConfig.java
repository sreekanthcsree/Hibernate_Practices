package com.first.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket changeView(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.first"))
                .paths(PathSelectors.ant("/student/**"))
                .build()
                .apiInfo(getApiInfo());
    }
    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("Student Springboot Application")
                .version("1.0.0")
                .description("this is a springboot application about student")
                .contact(new Contact("Manideep","www.google.com","manideep1436@gmail.com"))
                .build();
    }
}
