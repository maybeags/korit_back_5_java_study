package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;

    Computer() {
       type = "컴퓨터";
    }
    
    Computer(String type) {
        this.type = type;
    }

    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }
}
