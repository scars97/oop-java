package org.cafe;

import org.cafe.domain.Barista;
import org.cafe.domain.Cashier;
import org.cafe.domain.menu.Menu;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Menu menus = new Menu();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();

        menus.showMenu();
    }
}
