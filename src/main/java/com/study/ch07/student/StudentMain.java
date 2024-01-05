package com.study.ch07.student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Scanner scanner = new Scanner(System.in);
        String studentName = null;
        int studentAge = 0;
        int studentGrade = 0;
        String studentAddress = null;

        System.out.print("이름 입력>>");
        studentName = scanner.nextLine();
        if(studentService.isEmptyString(studentName)) {
            System.out.println("이름을 다시 입력하세요.");
            return;
        }

        System.out.print("나이 입력>>");
        studentAge = scanner.nextInt();

        System.out.print("학년 입력>>");
        studentGrade = scanner.nextInt();


        Student student = new Student(studentName, studentAge, studentGrade);

        studentService.registerStudentService(student);
    }
}
