package org.example.order;

public class Customer {

    public void order(String MenuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(MenuName);
        Cook cook = cooking.makeCook(menuItem);

        // 사실 여기서 메뉴가 없을 떄의 예외처리를 해줘야 한다!!
    }
}
