package com.sprint.mission;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // 롬복은 compileOnly, 컴파일할 때 어노테이션을 보고 final생성자를 만들어줌
@Getter
public class TestService2 {
    private final TestRepository testRepository;


    public int getRepositoryValue() {
        return testRepository.getValue();
    }
}
