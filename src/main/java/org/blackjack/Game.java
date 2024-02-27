package org.blackjack;

import org.blackjack.domain.*;

import java.util.Scanner;

/**
 * 게임 진행 프로세스
 */
public class Game {

    private static final int INIT_RECEIVE_CARD_COUNT = 2;

    public void play() {
        System.out.println("========= Blackjack =========");
        Scanner sc = new Scanner(System.in);

        // 클래스의 인스턴스 생성
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        initPhase(cardDeck, gamer);
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

    // 처음 시작시 Dealer와 Gamer가 2장씩 카드를 받는 역할
    private void initPhase(CardDeck cardDeck, Gamer gamer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
        // 매직너버를 피하기 위한 static 상수 사용
        // 매직넘버 : 정체를 알 수 없지만 특정 기능을 하는 숫자
        // 매직넘버 사용시 의미가 모호해지며 변경범위를 확인하기 어렵다.
        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            Card card = cardDeck.draw();
            gamer.receiveCard(card);
        }
    }

}
