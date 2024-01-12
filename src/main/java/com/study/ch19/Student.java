package com.study.ch19;


import lombok.ToString;

@ToString
public class Student {                                        // 1
    private String name;
    private String address;
    private int age;

    // 생성자로 만든 부분 alt + insert                          //  8
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static StudentBuilder builder() {                //  3
        return new StudentBuilder();
    }

    public static class StudentBuilder {                    //  2
        private String name;
        private String address;
        private int age;

        public Student build() {                            // 9
            return new Student(name, address, age);
        }

        public StudentBuilder name(String name) {           //  4
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {     // 5
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {                // 6
            this.age = age;
            return this;
        }

    }
}
