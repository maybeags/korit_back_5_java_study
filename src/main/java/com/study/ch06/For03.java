package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개? ");
        int starCount = scanner.nextInt();

        for(int i = 0 ; i < starCount ; i++){
            for(int j = 0; j < i + 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < starCount ; i++){
            for(int j = 0; j < starCount - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < starCount ; i++){
            for (int x = 0; x < starCount - i - 1; x++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0 ; i < starCount ; i++){
            for(int x = 0; x < i ; x++){
                System.out.print(" ");
            }
            for(int j = 0; j < starCount - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < starCount; i++){
            int num = (2*i) + 1;
            for(int x = 0; x < starCount - i - 1 ; x++){
                System.out.print(" ");
            }
            for(int j = 0; j < num ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        *
        **
        ***

        ***
        **
        *

           *
          **
         ***

       ***
        **
         *

           *
          ***
         *****


         */
    }
}
