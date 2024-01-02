package com.study.ch04;

import java.util.Scanner;

public class Operation04 {
    public static void main(String[] args) {
        /*
            << 문제 >>

            연도가 주어졌을 때, 윤년이면 true, 아니면 false를 출력하는 프로그램을 작성하시오.

            윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

            예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
            1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
            하지만, 2000년은 400의 배수이기 때문에 윤년이다.

            연도는 0보다 크고, 4001보다 작은 자연수이다.
            int year = 2000; => 결과 true
            int year = 1999; => 결과 false
         */
//        System.out.println("연도를 입력하세요 >> ");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        System.out.println(year > 0 && year < 4001 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0));

        int year1 = 2012;
        boolean step1 = year1 > 0;
        boolean step2 = year1 < 4001;
        boolean step3 = year1 % 4 == 0;
        boolean step4 = year1 % 100 != 0;
        boolean step5 = year1 % 400 == 0;

        boolean result = step1 && step2 && (step3 && step4 || step5);
        System.out.println("결과 => " + result);
    }
}
