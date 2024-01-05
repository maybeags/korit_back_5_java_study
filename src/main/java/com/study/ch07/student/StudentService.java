package com.study.ch07.student;

public class StudentService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank();
    }

    void registerStudentService(Student student) {
        StudentRepository studentRepository = new StudentRepository();

        System.out.println("서비스 까지 데이터 전달됨.");

        studentRepository.saveStudent(student);
    }
}
