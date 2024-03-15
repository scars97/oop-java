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

    public void addMenu(Menu order) {
        this.menuList.add(order);
    }

    public String showMenus() {
        StringBuilder sb = new StringBuilder();

        for (Menu menu : this.menuList) {
            sb.append(menu.getName() + " ");
        }

        return sb.toString();
    }
}
