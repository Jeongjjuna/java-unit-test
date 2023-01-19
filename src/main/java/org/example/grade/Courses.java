package org.example.grade;

import java.util.List;

public class Courses {
    private List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multipliedCreditAndCourseGrade() {
        // (학점수*교과목)의 합계
        return courses.stream()
                .mapToDouble(Course :: multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateToTotalCompletedCredit() {
        // 총 수강학점 수
        return courses.stream()
                .mapToInt(Course :: getCredit)
                .sum();
    }
}
