package com.lowwall.zeomzeom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ZeomzeomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeomzeomApplication.class, args);
    }

    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> java.util.Optional.of(java.util.UUID.randomUUID().toString());
    }
}
