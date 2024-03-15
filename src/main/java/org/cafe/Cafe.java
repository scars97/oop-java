package org.cafe;

import org.cafe.domain.*;

import java.util.List;
import java.util.Scanner;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Scanner sc = new Scanner(System.in);

        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        Orders orders = new Orders();

        showMenu();
        facing(sc, orders);
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

    // 고객 응대
    public void facing(Scanner sc, Orders orders) {
        String customerInput;
        int menuCnt = orders.getMenuList().size();

        while (true) {
            System.out.println("주문하실 메뉴를 선택해주세요. ex) C01 \n종료를 원하시면 0을 입력하세요.");
            customerInput = sc.nextLine();

            if ("0".equals(customerInput)) {
                if (menuCnt == 0) {
                    System.out.println("이용해주셔서 감사합니다.");
                } else {
                    // 주문내역
                    String orderMenus = orders.showMenus();
                    int totalPayment = orders.payment();
                    System.out.println("현재 주문 내역: \n" + orderMenus + "\n총 결제 금액: " + totalPayment);
                }
                break;
            }

            if (isMenu(customerInput)) {
                Menu pickMenu = Menu.valueOf(customerInput);
                List<Menu> menus = orders.addMenu(pickMenu);
                menuCnt = menus.size();
            } else {
                System.out.println("없는 메뉴입니다.");
            }
        }
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
