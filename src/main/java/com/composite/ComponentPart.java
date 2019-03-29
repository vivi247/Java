package com.composite;

import java.util.ArrayList;
import java.util.List;

public class ComponentPart {

}
    interface Component {
        void showPrice();
    }

    class Leaf implements Component {

        int price;
        String name;

        public Leaf(int price, String name) {
            this.price = price;
            this.name = name;
        }

        public void showPrice() {
            System.out.println(name+ ":" +price);
        }
    }

    class Composite implements Component {

        String name;
        List<Component> components = new ArrayList<Component>();

        public Composite(String name) {
            this.name = name;
        }

        public boolean addComponents(Component com){
            return components.add(com);
        }

        public boolean removeComponents(Component com) {
            return components.remove(com);
        }

        public void showPrice() {
            System.out.println(name);
            components.forEach(component -> {
                component.showPrice();
            });

        }
    }

