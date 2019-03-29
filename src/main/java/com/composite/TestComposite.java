package com.composite;

public class TestComposite {

    public static void main(String[] args) {

        Component hdd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(300,"Mouse");
        Component monitor = new Leaf(5000, "Monitor");
        Component ram = new Leaf(4000, "RAM");
        Component kb = new Leaf(500,"KeyBoard");

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite cpu = new Composite("CPU");
        Composite computer = new Composite("Computer");
        Composite mb = new Composite("MotherBoard");


        mb.addComponents(ram);
        mb.addComponents(hdd);

        cpu.addComponents(mb);

        cabinet.addComponents(cpu);
        cabinet.addComponents(monitor);

        ph.addComponents(mouse);
        ph.addComponents(kb);

        computer.addComponents(ph);
        computer.addComponents(cabinet);

        computer.showPrice();

    }
}
