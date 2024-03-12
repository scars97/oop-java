package org.cafe.domain.menu;

import lombok.Getter;

@Getter
public class Tea implements Menu {

    private String cd;
    private String name;
    private Integer price;

    public Tea(String cd, String name, Integer price) {
        this.cd = cd;
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
