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

        // TODO 중복 메뉴 출력 수정
        for (Menu menu : this.menuList) {
            String menuName = menu.getName();
            String menuCd = menu.getCd();

            if (isDuplicate(menuCd)) {
                int count = countOfDuplicateMenu(menuCd);
                menuName = menuName.concat("x" + count);
            }

            sb.append(menuName).append(" ");
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
