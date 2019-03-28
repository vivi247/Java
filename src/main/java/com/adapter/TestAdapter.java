package com.adapter;

public class TestAdapter {

    public static void main(String[] args) {
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(new PenAdapter());
        assignmentWork.writeAssignment("Pen Test");
    }
}
