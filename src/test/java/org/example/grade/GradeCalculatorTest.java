package org.example.grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수*교과목)의 합계/수강신청 총학점 수
 * 일급 컬렉션 사용
 */

public class GradeCalculatorTest {

    @DisplayName("학점을 계산이 잘 되는가")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OS", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
