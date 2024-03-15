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
    private Integer numberId;
    private List<Menu> menus;
    private Integer cash;

    public Customer() {
        this.menus = new ArrayList<>();
    }

    public void pickDrink(Menu menu) {
        this.menus.add(menu);
    }

    public List<Menu> order() {
        return this.menus;
    }
}
