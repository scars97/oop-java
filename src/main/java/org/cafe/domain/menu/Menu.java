package org.cafe.domain.menu;

import lombok.Getter;

@Getter
public class Menu {

    public void showMenu() {
        StringBuilder sb = new StringBuilder();

        sb.append("-------- Coffee --------\n");
        Coffee[] coffeeList = Coffee.values();
        for (Coffee coffees : coffeeList) {
            String coffeeString = "[" + coffees.cd + "] " + coffees.name + " " + coffees.price + "\n";
            sb.append(coffeeString);
        }

        sb.append("-------- Tea --------\n");
        Tea[] teaList = Tea.values();
        for (Tea teas : teaList) {
            String teaString = "[" + teas.cd + "] " + teas.name + " " + teas.price + "\n";
            sb.append(teaString);
        }

        System.out.println(sb);
    }

    public void withoutMenu(String cd) {
        try {
            Coffee order = Coffee.valueOf(cd);
            System.out.println(order.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("없는 메뉴");
        }
    }

    @Getter
    public enum Coffee {
        C01("C01", "아메리카노", 1500),
        C02("C02", "카페라떼", 2900),
        C03("C03", "카페모카", 3300),
        C04("C04", "바닐라라떼", 3300);

        private String cd;
        private String name;
        private Integer price;

        Coffee(String cd, String name, Integer price) {
            this.cd = cd;
            this.name = name;
            this.price = price;
        }
    }

    @Getter
    public enum Tea {
        T01("T01", "캐모마일", 2500),
        T02("T02", "아메리카노", 2500),
        T03("T03", "유자차", 2300);

        private String cd;
        private String name;
        private Integer price;

        Tea(String cd, String name, Integer price) {
            this.cd = cd;
            this.name = name;
            this.price = price;
        }
    }
}
