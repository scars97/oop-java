package org.cafe.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Orders {

    private List<Menu> menuList;

    public List<Menu> addMenu(Menu order) {
        this.menuList.add(order);

        return this.menuList;
    }

    public String showMenus(List<Menu> menus) {
        StringBuilder sb = new StringBuilder();

        for (Menu menu : menus) {
            sb.append(menu.getName() + " ");
        }

        return sb.toString();
    }
}
