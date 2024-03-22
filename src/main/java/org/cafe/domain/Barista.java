package org.cafe.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 캐시어에게 음료 제작 요청을 받는다.
 * 음료를 제작한다.
 * 제작된 음료를 고객에게 전달한다.
 */
public class Barista {
    private List<Menu> completion;

    public List<Menu> manufacturing(Orders orders) {
        List<Menu> orderList = orders.getMenuList();

        for (Menu menu : orderList) {
            String menuName = menu.getName();

            try {
                Thread.sleep(2000);
                System.out.println(menuName + " 완료");

                completion.add(menu);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }

        return completion;
    }

    public Barista() {
        this.completion = new ArrayList<>();
    }
}
