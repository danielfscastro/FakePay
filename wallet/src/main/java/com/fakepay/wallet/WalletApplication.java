package com.fakepay.wallet;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Wallet microservice REST API Documentation",
                description = "Wallet Demo microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Daniel Castro",
                        email = "demo@demo.com",
                        url = "https://www.spring.io"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Wallet microservice REST API Documentation",
                url = "http://localhost:8080/swagger-ui/index.html"
        )
)
public class WalletApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletApplication.class, args);
    }

}
