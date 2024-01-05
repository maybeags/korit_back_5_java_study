package com.study.ch07;

public class User01 {
    // 속성
    // username(아이디) - 필수
    // password(비밀번호) - 필수
    // name(이름)
    // email(이메일)

    // 메소드
    // setName(String name) - 메소드의 매개변수를 통해 name의 값을 변경
    // setEmail(String email) - 메소드의 매개변수를 통해 email의 값을 변경
    // showInfo() - 모든 속성값 출력

    String username;
    int  password;
    String name;
    String email;

    User01(String username, int password) {
        this.username = username;
        this.password = password;
    }

    User01() {
        name = name;
    }

    User01(String username, int password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }


    void showInfo() {
        System.out.println("아이디 : " + username);
        System.out.println("비밀번호 : " + password);
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
    }

    void setName(String name) {
       this.name = name;
    }
    void setEmail(String email) {
        this.email = email;
    }
}
