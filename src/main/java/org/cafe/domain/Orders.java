package org.cafe.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Orders {

    private List<Drink> orderList;

    public List<Drink> addOrder(Drink order) {
        this.orderList.add(order);

        return this.orderList;
    }

    public List<Drink> showOrders() {
        return this.orderList;
    }
}
