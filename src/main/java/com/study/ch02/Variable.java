package com.study.ch02;

public class Variable {

    public static void main(String[] args) {
        int date = 20231230;
        double date2= (double) date; //업캐스트이기 때문에 옵셔널
        int date3 = (int) date2; //다운캐스트기 때문에 네서서리

        // 문자 -> 정수 -> 실수 순으로 업캐스팅

        char a = '1';
        int b = a;
        double c = b;

        System.out.println(date+1);
        System.out.println(date+2);
        System.out.println(date+3);
        System.out.println(date+4);
        System.out.println(date+5);
        System.out.println(date+6);
        System.out.println(date+7);
        System.out.println(date+8);
        System.out.println(date+9);
    }
}
