package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType s = new StudentType();
        s.name = "안근수";
        s.age = 36;
        s.studentYear = 1;
        s.address = "부산광역시 연제구";

        System.out.println("이름 : " + s.name);
        System.out.println("나이 : " + s.age);
        System.out.println("학년 : " + s.studentYear + "학년");
        System.out.println("주소 : " + s.address);

        int a = 10;
        double b = a;
        Person p = s; //이것도 업캐스트에 해당된다
        StudentType junil2 = (StudentType) p; //이건 다운캐스트니까 강제형변환을 했지

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환; // 근데 이러면 안된대, 업캐스팅했던 걸 다시 다운캐스팅하는 건 가능한데, 처음부터 상위형태로 만들어놨던건 다운캐스팅이 불가능하다.

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;


    }
}
