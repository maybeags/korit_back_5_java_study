package com.study.ch01;

public class PrintStudy {
    /*
           첫글자 대문자로 가다가 단어 바뀌면 대문자 - 파스칼 표기법
           첫글자 소문자로 가다가 단어 바뀌면 대문자 - 카멜 표기법
           클래스 명은 파일명과 일치시키고 파스칼 표기법을 씀.
           변수명은 카멜 표기법
    */
    public static void main(String[] args) {
        /*
            자바는 main에서 프로그램이 실행된다
         */
        System.out.println(2 + 4);
        System.out.println("2 + 4");
        System.out.println("가");
        System.out.println("가나");
        System.out.println("\uAC00");
        System.out.println("\uAC10");
        System.out.println( "" +'김' + '준' + '일'); //문자열에다가 문자를 더한 사례인데, 문자열이 우선하기 때문에 문자들이 문자열이 돼서 한글로 출력 가능 - 순서, 자료형이 중요하다
        System.out.println( "김" + "준" + "일");
        System.out.println("" + 10 + 20); // 문자열에다가 숫자를 더한 사례인데, 문자열이 우선하기 때문에 숫자들이 문자열이 돼서 출력됨.
        System.out.println("나이 : " + (10 + 20)); // 소괄호 쓰면 우선순위가 변경돼서 수식 먼저 계산하게 됨.
        // 0000 0000
        // char자료형 -> 2바이트
        // 한글은 유니코드 쓴다 - 아스키코드 아니다
        // + 연산자는 숫자를 더하거나 문자'열'(not 문자)을 연결할 때 쓰는 것이다.

    }
}
