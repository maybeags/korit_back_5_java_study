package com.study.test02;

import java.util.List;

public class SubjectService {

    private List<String> subjects;

    public SubjectService(List<String> subjects) {
        this.subjects = subjects;
    }

    public void showSubjects() {

        for(String subject : subjects) {
            System.out.println(subject);
        }
    }
}
