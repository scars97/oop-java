package org.blackjack.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 카드
 *
 * 다이아몬드, 하트, 스페이드, 클럽 중 1개의 무느를 가진다.
 * A, 2~10, K, Q, J 중 하나를 가지고 있다.
 */
@Getter
@Setter
public class Card {
    private String pattern;
    private String denomination;
    private int point;

    public Card(String pattern, int index) {
        this.pattern = pattern;
        this.denomination = this.numberToDenomination(index);
        this.point = this.numberToPoint(index);
    }

    private String numberToDenomination(int number) {
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

    private int numberToPoint(int number) {
        if (number >= 11) {
            return 10;
        }
        return number;
    }

    @Override
    public String toString() {
        return "Card{" + "pattern='" + pattern + ", denomination='" + denomination + '}';
    }
}
