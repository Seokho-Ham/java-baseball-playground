package com.baseballgame;

public class RandomNumber {
    public static String makeOneRandomNumber(String str) {
        String number = Integer.toString((int) ((Math.random() * 10) + 1));
        while (checkOverlap(str, number)) {
            number = Integer.toString((int) ((Math.random() * 10) + 1));
        }
        return number;
    }

    public static boolean checkOverlap(String str, String number) {
        if (str.contains(number)) return true;
        return false;
    }

    public static String makeRandomNumbers() {
        String randomNum = "";
        while (randomNum.length() < 3) {
            randomNum += makeOneRandomNumber(randomNum);
        }

        return randomNum;
    }

}
