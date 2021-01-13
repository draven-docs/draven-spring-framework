package com.noxus.draven.spel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class MainConfig {
    @Bean
    public String name() {
        return "路粉";
    }

    @Bean
    public String msg() {
        return "欢迎和我一起学习java各种技术！";
    }
}
