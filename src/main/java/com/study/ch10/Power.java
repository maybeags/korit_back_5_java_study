package com.study.ch10;

//인터페이스에서의 메서드는 전부 추상 메서드로 간주된다
//인터페이스 상에서는 변수 선언이 불가능하다
//초기화를 하면 변수 선언이 가능하다
//정확하게는 상수 선언만 가능(final)
//인터페이스는 다중상속이 가능
//추상클래스는 일대일 상속만 가능
public interface Power {
    String ERROR_CODE = "-9999";

    void setPowerOn();
    void setPowerOff();

    default void test() {

    }
}
