package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {
//    @DisplayName("랜덤값 검사.. 사실상 불가능")
//    @Test
//    void passwordTest() {
//        // given
//        User user = new User();
//        PasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
//
//        // when
//        user.initPassword(randomPasswordGenerator);
//
//        // then
//        assertThat(user.getPassword()).isNotNull();
//    }

    @DisplayName("올바른 비밀번호 값 검사")
    @Test
    void CorrectPasswordTest() {
        // given
        User user = new User();


        // when
        user.initPassword(() -> "aaaabbbb");

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("틀린 비밀번호 값 검사")
    @Test
    void WrongPasswordTest() {
        // given
        User user = new User();

        // when
        user.initPassword(() -> "aa");

        // then
        assertThat(user.getPassword()).isNull();
    }
}