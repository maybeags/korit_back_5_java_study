package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();


        Car car = Car.builder().model("아반떼").color("블랙").build();

        System.out.println(car);

        Member member = new Member("김준일", "01099881916");

        Member member2 = Member.builder()
                .phone("01099881916")
                .build();

        System.out.println(member2);
    }
}
