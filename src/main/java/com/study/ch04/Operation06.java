package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*
            << 문제 >>

            조건연산자(삼항연산자)

            a > 0 ? "양수" : a == 0 ? "0" : "음수"
            조건연산자를 쓸 때는 결과값과 자료형을 일치시켜야한다.
         */

        int iResult = 10 > 2 ? 1111 : 2222;
        String sResult = 10 > 2 ? "1111" : "2222";
        // boolean bResult = 10 > 2 ? true : false;
        // boolean bResult = 10 > 2; 이거랑 위에거랑 똑같으니까 밑에 걸 써야 함.  간결하게 쓰세요. 시니어들이 보면 가슴이 먹먹하다고 함.
        System.out.println(iResult);

        String name = "김준일";
        String name2 = new String("김준일");

        System.out.println(name == name2);
        System.out.println(name == "김준일");
        System.out.println(name == "김준일");
        System.out.println("테스트 코드 작성");
    }
}
