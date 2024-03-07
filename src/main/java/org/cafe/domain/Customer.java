package org.cafe.domain;

import lombok.Getter;

import java.util.List;

/**
 * 메뉴를 확인한다.
 * 캐시어에게 주문할 메뉴를 전달한다.
 * 주문한 메뉴에 대한 돈을 지불한다.
 * 음료를 받는다.
 */
public class Customer {
    private Integer numberId;
    private List<?> menu; // TODO Coffee, Tea 담을 수 있는 객체 생성 필요
    private Integer cash;
    private boolean status;
}
