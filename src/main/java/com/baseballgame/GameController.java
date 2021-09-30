package com.baseballgame;

import java.util.HashMap;
import java.util.Scanner;

public class GameController {
    private static final String EXIT = "EXIT";
    private static final String STOP = "STOP";
    private static final String START = "START";
    private static final String RESTART = "RESTART";
    private static String randomNumber;
    private static String status = STOP;

    public void printHandler(String input) {
        if (Integer.parseInt(input) == 2) {
            status = EXIT;
            return;
        }

        HashMap<String, Integer> result = validateBall(randomNumber, input);
        int strike = result.get("strike");
        int ball = result.get("ball");

        if (strike > 0 && ball > 0) {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        }
        if (strike > 0 && ball == 0) {
            System.out.println(strike + "스트라이크");
        }
        if (strike == 0 && ball > 0) {
            System.out.println(ball + "볼");
        }
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        }
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            status = STOP;

        }

    }

    public HashMap<String, Integer> validateBall(String comBall, String userBall) {
        HashMap<String, Integer> result = new HashMap<>();
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            strike += isStrike(comBall.charAt(i), userBall.charAt(i));
            ball += isBall(comBall, userBall, i);
        }
        result.put("strike", strike);
        result.put("ball", ball);

        return result;
    }

    public int isStrike(char str1, char str2) {
        if (str1 == str2) {
            return 1;
        }
        return 0;
    }

    public int isBall(String str1, String str2, int index) {
        char ball1 = str1.charAt(index);
        char ball2 = str2.charAt(index);

        if ((ball1 != ball2) && str1.contains(Character.toString(ball2))) {
            return 1;
        }
        return 0;
    }

    public void run() {
        status = START;
        randomNumber = new RandomNumbers().makeRandomNumbers();
        User user = new User();
        while (status == START) {
            System.out.print("숫자를 입력해주세요: ");
            String input = user.setInput();
            printHandler(input);
        }
        if (status == STOP) {
            handleDecision(user);
        }
        if (status == RESTART) {
            run();
        }
        if (status == EXIT) {
            System.exit(0);
        }
    }

    public void handleDecision(User user) {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = user.setInput();
        if (Integer.parseInt(input) == 1) {
            status = RESTART;
        }
        if (Integer.parseInt(input) == 2) {
            status = STOP;
        }
    }

    public static void main(String[] args) {
        GameController computer = new GameController();

        computer.run();
    }
}
