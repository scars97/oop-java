package org.cafe;

import org.cafe.domain.*;

import java.util.Scanner;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();

        showMenu();
    }

    public void showMenu() {
        StringBuilder sb = new StringBuilder();

        sb.append("-------- Menu --------\n");
        Menu[] menuList = Menu.values();
        for (Menu menu : menuList) {
            sb.append(menu.toString());
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public void withoutMenu(String cd) {
        try {
            Menu drink = Menu.valueOf(cd);
            System.out.println(drink.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("없는 메뉴");
        }
    }
}
