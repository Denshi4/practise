package org.college.practise2.task5.p2;

public class Main {
    public static void main(String[] args) {

        DishManager manager = new DishManager("YOOManeger", 700, 350, "Chicken Curry");

        PriceWeight layout = new PriceWeight("Paratha", 40, 100);
        manager.addComponent(layout);

        layout.addComponent(new Describe("Lassi", "Yoghurt drink", "Cow.png"));
        layout.addComponent(new Describe("Besan Ladu", "Coockie", "brown_coockie.png"));

        manager.order();

        try {
            Describe describe = new Describe("Achar", "Very spicy ", "AAAAAA HOT.png");
            describe.addComponent(new Describe("Green chatni", "Medium spicy", "/scam/greenSouse.png"));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
