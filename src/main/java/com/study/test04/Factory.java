package com.study.test04;

public class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory() {}

    public static Factory getInstatnce() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
