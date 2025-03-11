package com.sprint.mission;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TestService testService(){
        TestService testService = new TestService();
        testService.setValue(100);
     return testService;
    }
}
