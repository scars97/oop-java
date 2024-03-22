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

    public void addOrder(Menu menu) {
        this.menuList.add(menu);
    }

    public String showOrderList() {
        StringBuilder sb = new StringBuilder();

        for (Menu menu : this.menuList) {
            sb.append(menu.getName()).append(" ");
        }

        return sb.toString();
    }
}
