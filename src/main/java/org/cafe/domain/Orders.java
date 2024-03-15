package org.cafe.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Orders {

    private List<Menu> orderList;

    public List<Menu> addOrder(Menu order) {
        this.orderList.add(order);

        return this.orderList;
    }

    public List<Menu> showOrders() {
        return this.orderList;
    }
}
