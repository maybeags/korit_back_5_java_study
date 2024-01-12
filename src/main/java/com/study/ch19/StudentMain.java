package com.study.ch19;

public class StudentMain {

    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = Student.builder();

        Student student = Student.builder()
                .name("김준일")
                .address("부산 동래구")
                .age(31)
                .build();

        System.out.println(student);
    }
}
