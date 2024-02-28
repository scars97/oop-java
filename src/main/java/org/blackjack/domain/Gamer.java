package org.blackjack.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 게이머
 *
 * 추가로 카드를 받는다.
 * 뽑은 카드를 소유한다.
 * 카드를 오픈한다.
 */
@Getter
@Setter
public class Gamer implements Player {
    private List<Card> cards;
    private boolean turn;
    private String name;

    public Gamer(String name) {
        this.cards = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void receiveCard(Card card) {
        this.cards.add(card);
        this.showCard();
    }

    @Override
    public void showCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }

    @Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
