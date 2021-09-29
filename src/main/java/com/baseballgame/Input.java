package com.baseballgame;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);
    public static String inputValue(){
        System.out.print("숫자를 입력해주세요 : ");
        String val = sc.nextLine();
        while(val.length()>3){
            System.out.println("3자리까지만 입력 가능합니다.");
            inputValue();
        }
        return val;
    }
    public static String restartGame(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String val = sc.nextLine();
        return val;
    }
}
