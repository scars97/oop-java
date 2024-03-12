package org.cafe;

import org.cafe.domain.Barista;
import org.cafe.domain.Cashier;
import org.cafe.domain.menu.Coffee;
import org.cafe.domain.menu.Menu;
import org.cafe.domain.menu.Tea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cafe {

    public void open() {
        System.out.println("========= Cafe =========");
        Cashier cashier = new Cashier();
        Barista barista = new Barista();

        List<Menu> coffeeList = Arrays.asList(
            new Coffee("C01", "아메리카노", 1500),
            new Coffee("C02", "카페라떼", 2900),
            new Coffee("C03", "카페모카", 3200),
            new Coffee("C04", "바닐라라떼", 3200)
        );

        List<Menu> teaList = Arrays.asList(
                new Tea("T01", "캐모마일", 2500),
                new Tea("T02", "얼그레이", 2500),
                new Tea("T03", "유자차", 2300)
        );


    }
}
