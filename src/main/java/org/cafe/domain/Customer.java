package org.cafe.domain;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 메뉴를 확인한다.
 * 캐시어에게 주문할 메뉴를 전달한다.
 * 주문한 메뉴에 대한 돈을 지불한다.
 * 음료를 받는다.
 */
@Getter
public class Customer {
    private List<Menu> menus;

    public Customer() {
        this.menus = new ArrayList<>();
    }

    public List<Menu> pickDrink(Menu menu) {
        this.menus.add(menu);
        return this.menus;
    }

    public List<Menu> order() {
        return this.menus;
    }

    public int payment() {
        int price = 0;
        for (Menu menu : this.menus) {
            price += menu.getPrice();
        }

        return price;
    }
}
