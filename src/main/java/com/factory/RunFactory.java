package com.factory;

public class RunFactory {
    public static void main(String[] args) {
        FactoryPattern factory = new FactoryPattern();
        AbstratFactory pattern = factory.getInstance("Factory");
        System.out.println(pattern.getMethod());
    }
}
