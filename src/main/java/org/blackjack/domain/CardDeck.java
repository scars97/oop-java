package org.blackjack.domain;

import lombok.Getter;

import java.util.List;

/**
 * 카드뭉치
 *
 * 52개의서로 다른 카드를 가지고 있다.
 * 카드 1개를 뽑아준다.
 */
@Getter
public class CardDeck {
    private List<Card> cards;
}
