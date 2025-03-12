package com.sprint.mission;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class TestRepository {
    private int value;

    public void updateValue(int value) {
        this.value = value;
    }

}
