package org.cafe.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<String, Integer> duplicateMenu = new HashMap<>();

        // TODO 중복 메뉴 출력 수정
        for (Menu menu : this.menuList) {
            String menuName = menu.getName();
            String menuCd = menu.getCd();

            if (isDuplicate(menuCd)) {
                if (duplicateMenu.containsKey(menuCd)) {
                    duplicateMenu.put(menuCd, duplicateMenu.get(menuCd) + 1);
                } else {
                    duplicateMenu.put(menuCd, 1);
                }
            } else {
                sb.append(menuName).append(" ");
            }
        }

        for (Map.Entry<String, Integer> entry : duplicateMenu.entrySet()) {
            Menu menu = Menu.valueOf(entry.getKey());
            int count = entry.getValue();

            sb.append(menu.getName()).append("x").append(count);
        }

        return sb.toString();
    }

    private int countOfDuplicateMenu(String cd) {
        int count = 0;

        for (Menu menu : this.menuList) {
            if (cd.equals(menu.getCd())) {
                count++;
            }
        }

        return count;
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
