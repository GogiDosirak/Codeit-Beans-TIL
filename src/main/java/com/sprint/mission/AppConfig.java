package com.sprint.mission;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public TestRepository getTestRepository() {
        TestRepository testRepository = new TestRepository();
        testRepository.updateValue((int) (Math.random() * 100));
        return testRepository;
    }


    @Bean
    public TestService1 testService1(){
        TestRepository testRepository = getTestRepository();
     return new TestService1(testRepository);
    }

    @Bean
    public TestService2 testService2(){
        TestRepository testRepository = getTestRepository();
        return new TestService2(testRepository);
    }
}
