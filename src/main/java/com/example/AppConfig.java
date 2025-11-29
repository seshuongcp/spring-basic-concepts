package com.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    HelloService helloService() {
        return new HelloService();
    }

    @Bean
    GreetingRepository getGreetingRepository(){
        return new GreetingRepository();
    }

    @Bean
    GreetingService getGreetingService(GreetingRepository repository){
        return new GreetingService(repository);
    }

    /*@Bean
    MultiConstructorService getMultiConstructorService(GreetingRepository greetingRepository, @Value("${app.multiservice.message}") String msg){
        return new MultiConstructorService(greetingRepository, msg);
    }*/

    @Bean
    MultiConstructorService getMultiConstructorService(){
        return new MultiConstructorService();
    }
}
