package org.example.calculator.calculate;

public interface NewArithmeticOperator {
    boolean supports(String operator); // 이 연산자를 지원하는 가?
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
