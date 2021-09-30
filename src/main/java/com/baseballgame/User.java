package com.baseballgame;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    public String setInput(){
        String input = sc.next();
        if(input.length()>3){
            return setInput();
        }
        return input;
    }
}
