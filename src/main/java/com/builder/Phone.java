package com.builder;

public class Phone {

    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    Phone(String os,
            int ram,
            String processor,
            double screensize,
            int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screensize=" + screensize +
                ", battery=" + battery +
                '}';
    }
}
