package org.cafe.domain;

import lombok.Getter;

import java.util.*;

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

        Map<String, Integer> duplicateMenu = duplicateSort();

        for (Map.Entry<String, Integer> entry : duplicateMenu.entrySet()) {
            Menu menu = Menu.valueOf(entry.getKey());
            int count = entry.getValue();

            sb.append(menu.getName()).append("x").append(count).append(" ");
        }

        return sb.toString();
    }

    private Map<String, Integer> duplicateSort() {
        Map<String, Integer> duplicateMenu = new HashMap<>();

        for (Menu menu : this.menuList) {
            String menuCd = menu.getCd();

            if (isDuplicate(menuCd)) {
                duplicateMenu.put(menuCd, duplicateMenu.getOrDefault(menuCd, 0) + 1);
            }
        }

        return duplicateMenu;
    }

    private Boolean isDuplicate(String cd) {
        for (Menu inMenu : this.menuList) {
            if (cd.equals(inMenu.getCd())) {
                return true;
            }
        }
        return false;
    }
}
