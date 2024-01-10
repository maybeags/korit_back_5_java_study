package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일", "동래구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("김준일", "동래구");


        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);
        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        System.out.println(objectTest.hashCode());
        System.out.println(objectTest1.hashCode());
    }
}
