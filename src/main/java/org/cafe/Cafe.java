package org.cafe;

import org.cafe.domain.*;

import java.util.Scanner;

public class Cafe {
    private static final String STOP_ORDER = "0";

    public void open() {
        System.out.println("========= Cafe =========");
        Scanner sc = new Scanner(System.in);

        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        Orders orders = new Orders();

        showMenu();
        Orders customerOrder = initOrder(sc, orders);
        payment(customerOrder);
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

    public void payment(Orders orders) {

    }

    public Orders initOrder(Scanner sc, Orders orders) {
        String customerInput;

        while (true) {
            System.out.println("주문하실 메뉴를 선택해주세요. ex) C01 \n종료를 원하시면 0을 입력하세요.");
            customerInput = sc.nextLine();

            if (STOP_ORDER.equals(customerInput)) {
                break;
            }

            if (isMenu(customerInput)) {
                Menu pickMenu = Menu.valueOf(customerInput);
                orders.addMenu(pickMenu);
            } else {
                System.out.println("없는 메뉴입니다.");
            }
        }
        System.out.println("주문내역: \n" + orders.showMenus() + "\n결제금액: " + orders.amount());

        return orders;
    }

    public boolean isMenu(String cd) {
        try {
            Menu.valueOf(cd);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
