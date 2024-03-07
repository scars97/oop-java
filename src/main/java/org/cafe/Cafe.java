package org.cafe;

import org.cafe.domain.Barista;
import org.cafe.domain.Cashier;
import org.cafe.domain.Coffee;
import org.cafe.domain.Tea;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
    }
}
