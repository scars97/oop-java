package org.cafe.domain.menu;

import lombok.Getter;

@Getter
public enum Tea {
    CHAMOMILE("T01", "캐모마일", 2500),
    EARL_GREY("T02", "얼그레이", 2500),
    YUZA("T03", "유자차", 2300);

    private String cd;
    private String name;
    private Integer price;

    Tea(String cd, String name, Integer price) {
        this.cd = cd;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
