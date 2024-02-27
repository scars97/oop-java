package org.blackjack.domain;

import java.util.List;

/**
 * 딜러
 *
 * 추가로 카드를 받는다.
 * 단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다.
 * 뽑은 카드를 소유한다.
 * 카드를 오픈한다.
 */
public class Dealer {
    private List<Card> cards;

    public void receiveCard(Card card) {

    }

    public List<Card> openCards() {
        return null;
    }
}
