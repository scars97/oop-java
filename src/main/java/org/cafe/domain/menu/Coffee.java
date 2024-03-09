package org.cafe.domain.menu;

import lombok.Getter;

@Getter
public enum Coffee {
    AMERICANO("C01", "아메리카노", 1500),
    LATTE("C02", "카페라떼", 2900),
    MOCHA("C03", "카페모카", 3200),
    VANILLA("C04", "바닐라라떼", 3200);

    private String cd;
    private String name;
    private Integer price;

    Coffee(String cd, String name, Integer price) {
        this.cd = cd;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
