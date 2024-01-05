package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer(); //생성 - 뉴 인스턴스를 만드는 행위를 생성이라고 할 예정 - 메모리를 할당한다는 의미이기도 함.
        Computer computer2 = new Computer("노트북");

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);

        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";
    }
}
