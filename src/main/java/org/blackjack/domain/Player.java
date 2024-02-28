package org.blackjack.domain;

import java.util.List;

public interface Player {

    void receiveCard(Card card);

    void showCard();

    List<Card> openCards();

    void turnOff();

    void turnOn();

    boolean isTurn();

    String getName();
}
