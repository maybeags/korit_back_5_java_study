package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {

        User01 user1 = new User01("aaa", 1234);
        User01 user2 = new User01("bbb", 5678, "김준이", "suren0709@gmail.com");

        user1.showInfo();
        System.out.println("-------------------------------------------------");

        user2.showInfo();
        System.out.println("-------------------------------------------------");

        user1.setName("김준일");
        user1.setEmail("asdf@gmail.com");

        user1.showInfo();

    }
}
