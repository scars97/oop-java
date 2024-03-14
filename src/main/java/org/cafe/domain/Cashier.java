package org.cafe.domain;

import java.util.List;

/**
 * 고객의 주문을 받는다.
 * 고객에게 주문한 메뉴에 대한 결제를 요청한다.
 * 고객에게 돈을 받는다.
 * 바리스타에게 음료 제작을 요청한다.
 */
public class Cashier {
    private List<?> menus;
    private Integer cash;
}
