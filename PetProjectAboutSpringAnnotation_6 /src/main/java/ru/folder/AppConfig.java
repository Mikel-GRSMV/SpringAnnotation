package ru.folder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "ru.folder")
public class AppConfig {
    @Bean
    public Message message(){
        return new HelloMessage(" Mike");
    }
    @Bean
    public MessageRendererInterface rendererInterface(){
        return new MessageRendererError(message());
    }

}
