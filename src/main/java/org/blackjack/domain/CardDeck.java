package org.blackjack.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 카드뭉치
 *
 * 52개의서로 다른 카드를 가지고 있다.
 * 카드 1개를 뽑아준다.
 */
@Getter
public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    private List<Card> cards;

    // 생성자는 실행을 시킬 역할이 있을 뿐, 실제 비즈니스 로직을 알 필요 x
    public CardDeck() {
        cards = this.generateCards();
    }

    public Card draw() {
        Card selectedCard = getRandomCard();
        cards.remove(selectedCard);
        return selectedCard;
    }

    private Card getRandomCard() {
        int size = cards.size();
        int select = (int) (Math.random() * size);
        return cards.get(select);
    }

    private List<Card> generateCards() {
        // draw한 카드는 카드덱에서 제거해야하므로 ArrayList 대신 LinkedList
        List<Card> cards = new LinkedList<>();

        for (String pattern : PATTERNS) {
            for (int i = 1; i < CARD_COUNT; i++) {
                String denomination = numberToDenomination(i);
                Card card = new Card(pattern, denomination);

                cards.add(card);
            }
        }

        return cards;
    }

    private static String numberToDenomination(int number) {
        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        }

        return String.valueOf(number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
