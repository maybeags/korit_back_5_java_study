package com.study.ch10;
/*
    [ 추상화 ]
    1. 추상 클래스 abstract class
    2. 인터페이스 interface
 */

public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드 - 추상 메소드는 추상 클래스와 인터페이스에서만 정의 가능
    abstract void showDeviceState();
}
