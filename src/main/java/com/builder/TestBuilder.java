package com.builder;

public class TestBuilder {
    public static void main(String[] args) {
//        Phone phone = new Phone("Android",2,"SP",6,3200);
        Phone phone = new PhoneBuilder().setOs("Android").setBattery(3600).getPhone();
        System.out.println(phone);
    }
}
