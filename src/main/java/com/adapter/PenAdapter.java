package com.adapter;

public class PenAdapter implements Pen{

    PenPilot pilot= new PenPilot();

    public void write(String str) {
        pilot.marks(str);
    }
}
