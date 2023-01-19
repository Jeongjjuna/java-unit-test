package org.example.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @DisplayName("메뉴판ㄴ에서 메뉴 이름에 해당하는 메뉴를 반환한다.")
    @Test
    void chooseTest() {
        MenuItem item1 = new MenuItem("돈까스", 5000);
        MenuItem item2 = new MenuItem("냉면", 7000);
        Menu menu = new Menu(List.of(item1, item2));

        MenuItem menuItem = menu.choose("돈까스");

        assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 5000));

    }

    @DisplayName("메뉴판에 없는 메뉴를 선택할 시 예외를 반환한다.")
    @Test
    void chooseTest2() {
        MenuItem item1 = new MenuItem("돈까스", 5000);
        MenuItem item2 = new MenuItem("냉면", 7000);
        Menu menu = new Menu(List.of(item1, item2));

        assertThatCode(() -> menu.choose("라면"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 메뉴 이름 입니다.");
    }
}
