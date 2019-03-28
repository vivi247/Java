package com.factory;

public class FactoryPattern {

    public AbstratFactory getInstance(String className) {
        if (className.equalsIgnoreCase("Factory1")) {
            return new Factory1();
        } else if(className.equalsIgnoreCase("Factory2")) {
            return new Factory2();
        } else {
            return new DeafaultFactory();
        }
    }
}
