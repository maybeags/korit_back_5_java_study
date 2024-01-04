package com.study.ch03;

public class Function02 {

    // 매개변수x, 리턴x
    public static void fx01(){
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    public static void fx02(int age, String name){
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }
    // 오버로딩 : 함수명이 같더라도 매개변수의 자료형이 다르면 함수정의가 가능하다.
    public static void fx02(String name, int age){ //똑같은 함수라도 자료형이 다르기 때문에 가능 - 변수명이랑은 상관없음. - 순서 바뀌는 거 가능
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();
    }

    public static int fx03(){
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public static String fx04(String name, int age){
        System.out.println("fx04 함수 실행");
        return name + ", " + age;
    }

    public static void main(String[] args) {
        fx01();

        fx02(37, "안근수");
        fx02("김준일", 31);
        int num = fx03();
        System.out.println(num);
        String profile = fx04("안근수", 37);
        System.out.println(profile);
    }
}
