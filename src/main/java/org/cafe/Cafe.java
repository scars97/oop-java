package org.cafe;

import org.cafe.domain.Barista;
import org.cafe.domain.Cashier;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
    }
}
