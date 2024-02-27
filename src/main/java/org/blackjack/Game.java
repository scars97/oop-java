package org.blackjack;

import org.blackjack.domain.CardDeck;
import org.blackjack.domain.Dealer;
import org.blackjack.domain.Gamer;
import org.blackjack.domain.Rule;

/**
 * 게임 진행 프로세스
 */
public class Game {

    public void play() {
        System.out.println("========= Blackjack =========");

        // 클래스의 인스턴스 생성
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
    }
}
