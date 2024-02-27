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
    private String pattern; // 무늬
    private String denomination; // 끗수
}
