package org.cafe.domain;


import lombok.Getter;

import java.util.List;

/**
 * 고객의 주문을 받는다.
 * 고객에게 주문한 메뉴에 대한 결제를 요청한다.
 * 고객에게 돈을 받는다.
 * 바리스타에게 음료 제작을 요청한다.
 */
@Getter
public class Cashier {
    private Integer sales;

    public Cashier() {
        this.sales = 0;
    }

    public int showSales() {
        return this.sales;
    }

    public int responsePayment(int amount) {
        this.sales += amount;
        return amount;
    }

    public int requestPayment(Orders orders) {
        List<Menu> menuList = orders.getMenuList();
        return amount(menuList);
    }

    public int amount(List<Menu> menuList) {
        int price = 0;
        for (Menu menu : menuList) {
            price += menu.getPrice();
        }

        return price;
    }
}
