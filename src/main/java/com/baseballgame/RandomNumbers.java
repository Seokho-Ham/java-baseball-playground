package com.baseballgame;

public class RandomNumbers {

    public static final int MAX_NUM = 9;
    public static final int MIN_NUM = 1;
    public static final int NUMBER_LENGTH = 3;

    public String makeSingleRandomNumber(String number){
        int randomNum = (int)(Math.floor((Math.random()*10))+ 1);
        String result = Integer.toString(randomNum);

        boolean rangeCheck = validateRange(result);
        boolean overlapCheck = validateOverlap(number, result);

        if(rangeCheck && overlapCheck){
            return result;
        }

        return "";
    }
    public boolean validateOverlap(String numbers, String num){
        if(numbers.contains(num)){
            return false;
        }
        return true;
    };
    public boolean validateRange(String number){
        if(Integer.parseInt(number)> MAX_NUM || Integer.parseInt(number)< MIN_NUM){
            return false;
        }
        return true;
    }
    public boolean validateLength(String number){
        if(number.length()!= NUMBER_LENGTH){
            return false;
        }
        return true;
    }

    public String makeRandomNumbers(){
        String result = "";
        while(!validateLength(result)){
            result += makeSingleRandomNumber(result);
        }
        return result;
    }

}
