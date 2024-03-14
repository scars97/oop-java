package org.cafe;

import org.cafe.domain.Barista;
import org.cafe.domain.Cashier;
import org.cafe.domain.Drink;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Cashier cashier = new Cashier();
        Barista barista = new Barista();

        showMenu();
        withoutMenu("C00");
    }

    public void showMenu() {
        StringBuilder sb = new StringBuilder();

        sb.append("-------- Menu --------\n");
        Drink[] drinkList = Drink.values();
        for (Drink drink : drinkList) {
            String drinkString = "[" + drink.getCd() + "] " + drink.getName() + " " + drink.getPrice() + "\n";
            sb.append(drinkString);
        }

        System.out.println(sb);
    }

    public void withoutMenu(String cd) {
        try {
            Drink order = Drink.valueOf(cd);
            System.out.println(order.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("없는 메뉴");
        }
    }
}
