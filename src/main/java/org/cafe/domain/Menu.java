package org.cafe.domain;

import lombok.Getter;

@Getter
public enum Menu {

    C01("C01", "아메리카노", 1500),
    C02("C02", "카페라떼", 2900),
    C03("C03", "카페모카", 3300),
    C04("C04", "바닐라라떼", 3300),
    T01("T01", "캐모마일", 2500),
    T02("T02", "얼그레이", 2500),
    T03("T03", "유자차", 2300);

    private final String cd;
    private final String name;
    private final Integer price;

    Menu(String cd, String name, Integer price) {
        this.cd = cd;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + this.cd + "] " + this.name + " " + this.price;
    }
}
