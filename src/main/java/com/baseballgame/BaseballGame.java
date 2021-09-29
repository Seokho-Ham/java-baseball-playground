package com.baseballgame;

import java.util.ArrayList;

public class BaseballGame {
    public String randomNumber;

    public int checkStrike(int index, char num) {
        //num이 같은 위치면 return 1 아니면 0;
        char targetNum = randomNumber.charAt(index);
        if (targetNum == num) {
            return 1;
        }
        return 0;
    }

    public int checkBall (int index,char num) {
        //contains으로 검사 -> 있으면 1 없으면 0;

        char targetNum = randomNumber.charAt(index);
        if ((targetNum != num) && (randomNumber.contains(Character.toString(num)))) {
            return 1;
        }
        return 0;
    }


    public boolean printResult(int s, int b) {

        if (s > 0 && b > 0) {
            System.out.printf("%d스트라이크 %d볼\n", s, b);
        }
        if (s > 0 && b == 0) {
            System.out.printf("%d스트라이크\n", s);
        }
        if (s == 0 && b > 0) {
            System.out.printf("%d볼\n", b);
        }
        if (s == 0 && b == 0) {
            System.out.println("낫싱");
        }
        if (s == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
            return true;
        }
        return false;

    }

    public boolean compareNumbers(String input) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            strike += checkStrike(i, input.charAt(i));
            ball += checkBall(i,input.charAt(i));
        }


        boolean result = printResult(strike, ball);
        if(result){
            return result;
        }
        return false;
    }

    public boolean startGame(boolean status) {
        randomNumber = RandomNumber.makeRandomNumbers();

        while (!status) {
            String input = Input.inputValue();
            status = compareNumbers(input);
        }
        String console = Input.restartGame();
        if(console.equals("2")){
           return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();

        boolean gameStatus = false;
        while(!gameStatus){
            gameStatus = game.startGame(gameStatus);
        }
    }

}
