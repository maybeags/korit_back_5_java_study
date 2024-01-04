package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        if (x > 0){
            if (y > 0) {
                System.out.println("1사분면");
            } else System.out.println("4사분면");
        } else if (x < 0){
            if (y > 0){
                System.out.println("2사분면");
            } else System.out.println("3사분면");
        } else if (x == 0) {
            if (y == 0) {
                System.out.println("x와 y가 0입니다.");
            }
        }

        if(x==0 || y==0){
            System.out.println("오류");
        } else if(x>0 && y >0){
            System.out.println("1사분면");
        } else if(x<0 && y >0) {
            System.out.println("2사분면");
        } else if(x<0 && y <0) {
            System.out.println("3사분면");
        } else if(x>0 && y <0) {
            System.out.println("4사분면");
        }
    }
}
