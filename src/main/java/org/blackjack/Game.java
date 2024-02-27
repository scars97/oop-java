package org.blackjack;

import org.blackjack.domain.*;

import java.util.Scanner;

/**
 * 게임 진행 프로세스
 */
public class Game {

    public void play() {
        System.out.println("========= Blackjack =========");
        Scanner sc = new Scanner(System.in);

        // 클래스의 인스턴스 생성
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        playingPhase(sc, cardDeck, gamer);
    }

    private void playingPhase(Scanner sc, CardDeck cardDeck, Gamer gamer) {
        String gameInput;
        while (true) {
            System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
            gameInput = sc.nextLine();

            if ("0".equals(gameInput)) {
                break;
            }

            Card card = cardDeck.draw();
            gamer.receiveCard(card);
        }
    }
}
