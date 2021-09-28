package com.calculator;

import java.util.Scanner;

public class StringCalculator {
    public int result;

    public StringCalculator(int firstVal) {
        this.result = firstVal;
    }

    public void add(int number) {
        this.result += number;
    }

    public void subtract(int number) {
        this.result -= number;
    }

    public void multiply(int number) {
        this.result *= number;
    }

    public void divide(int number) {
        this.result /= number;
    }

    public void calculate(String operator, int number) {
        switch (operator) {
            case "+": {
                add(number);
                break;
            }
            case "-": {
                subtract(number);
                break;
            }
            case "*": {
                multiply(number);
                break;
            }
            case "/": {
                divide(number);
                break;
            }
            default:
                break;
        }
    }
    public int calculate(String[] values){
        for (int i = 1; i < values.length; i += 2) {
            int num = Integer.parseInt(values[i + 1]);
            calculate(values[i], num);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산식을 입력해주세요");
        String value = sc.nextLine();
        String[] values = value.split(" ");
        StringCalculator calculater = new StringCalculator(Integer.parseInt(values[0]));

        calculater.calculate(values);
        System.out.println(calculater.result);

    }
}


// 1. 인덴트는 1까지만 허용.
// 2. else는 사용하지 말자.

//- 덧셈, 뺄셈, 곱하기, 나누기 메소드별로 분리
