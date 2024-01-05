package com.study.ch07.student;

public class StudentRepository {

    void saveStudent(Student student) {
        StudentDB studentDB = new StudentDB();
        studentDB.insertStudent(student);
    }
}
