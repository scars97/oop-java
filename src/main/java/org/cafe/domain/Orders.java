package org.cafe.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Orders {

    private List<Menu> menuList;

    public Orders() {
        this.menuList = new ArrayList<>();
    }

    public List<Menu> addMenu(Menu order) {
        this.menuList.add(order);

        return this.menuList;
    }

    public String showMenus() {
        StringBuilder sb = new StringBuilder();

        for (Menu menu : this.menuList) {
            sb.append(menu.getName() + " ");
        }

        return sb.toString();
    }

    public int payment() {
        int price = 0;
        for (Menu menu : this.menuList) {
            price += menu.getPrice();
        }

        return price;
    }
}
