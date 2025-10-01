package com.pluralsight;

public class classExample {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Nissan");
        car1.setModel("Altima");
        car1.display();

        Car car2 = new Car();
        car2.setMake("Ford");
        car2.setModel("Explorer");
        car2.display();
    }
}
