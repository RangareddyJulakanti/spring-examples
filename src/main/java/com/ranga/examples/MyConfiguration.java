
package com.ranga.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean(name = "myController")
    public MyController myBean(){
        return new MyController();
    }
}

