package com.study.ch07.student;

public class StudentDB {
    void insertStudent(Student student) {
        System.out.println("DB에 Insert 완료");
        System.out.println("이름 : " + student.name);
        System.out.println("나이 : " + student.age);
        System.out.println("학년 : " + student.grade);
        System.out.println();
    }
}
