package org.example.calculator;

import org.example.calculator.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveNumberTest {

    @DisplayName("양수일 때 잘 생성되는가")
    @Test
    void createTest1() {
        assertThatCode(() -> new PositiveNumber(10))
                .doesNotThrowAnyException();
    }

    @DisplayName("0또는 음수일 때 에러발생 하는가")
    @ParameterizedTest
    @ValueSource(ints = {0, -3})
    void createTest2(int value) {
        assertThatCode(() -> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수를 전달할 수 없습니다.");
    }
}
