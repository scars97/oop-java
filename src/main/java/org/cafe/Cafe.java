package org.cafe;

import org.cafe.domain.*;

import java.util.List;
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
        Orders completeOrder = payment(sc, customerOrder, cashier);
        List<Menu> completion = manufacturing(completeOrder, barista);

        String result = result(completion);
        System.out.println(result + "\n" + "보유 금액: " + cashier.showSales());
        sc.close();
    }

    public void showMenu() {
        StringBuilder sb = new StringBuilder();

        sb.append("-------- Menu --------\n");
        Menu[] menuList = Menu.values();
        for (Menu menu : menuList) {
            sb.append(menu.toString()).append("\n");
        }

        System.out.println(sb);
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
                orders.addOrder(pickMenu);
            } else {
                System.out.println("없는 메뉴입니다.");
            }
        }
        System.out.println("주문내역: \n" + orders.showOrderList());

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

    public Orders payment(Scanner sc, Orders orders, Cashier cashier) {
        int customerInput;
        boolean isPayment = false;

        int totalAmount = cashier.requestPayment(orders);
        System.out.println("총 결제금액은 " + totalAmount + " 입니다. 결제금액을 입력해주세요.");

        while (!isPayment) {
            customerInput = sc.nextInt();
            if (customerInput != totalAmount) {
                System.out.println("금액이 맞지 않습니다. 다시 입력해주세요.");
            } else {
                int receiveAmount = cashier.responsePayment(customerInput);
                System.out.println(receiveAmount + " 결제되었습니다. 음료를 제조합니다. 잠시만 기다려주세요.");
                isPayment = true;
            }
        }

        return orders;
    }

    private List<Menu> manufacturing(Orders orders, Barista barista) {
        return barista.manufacturing(orders);
    }

    private String result(List<Menu> menus) {
        StringBuilder sb = new StringBuilder();

        sb.append("주문하신 ");
        for (Menu menu : menus) {
            sb.append(menu.getName()).append(" ");
        }
        sb.append("나왔습니다.");

        return sb.toString();
    }
}
