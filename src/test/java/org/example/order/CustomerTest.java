package org.example.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 1. 도메인을 구성하는 객체에는 어떤것들이 있나 고민
 *      ㄴ 손님, 메뉴판, 메뉴(돈까쓰/냉면/만두)(o), 요리사(o), 요리(o)
 * 2. 객체들 간의 관계를 고민
 *      ㄴ 손님 -- 메뉴판 -- 요리사 -- 요리
 *      ㄴ 메뉴판 -- 메
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링하기
 *      ㄴ 손님 -- 손님타입
 *      ㄴ 돈까스/냉면/만두 -- 요리타입
 *      ㄴ 메뉴판 -- 메뉴판타입
 *      ㄴ 메뉴 -- 메뉴타입
 * 4. 협력을 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현하기
 */


public class CustomerTest {

    @DisplayName("메뉴 이름에 해당하는 요리를 주문한다")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        MenuItem item1 = new MenuItem("돈까스", 5000);
        MenuItem item2 = new MenuItem("냉면", 7000);
        Menu menu = new Menu(List.of(item1, item2));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();

    }
}
