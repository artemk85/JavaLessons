package ru.artemk;


class Car {
    String color;
    String engine;
    int doorCount;

    Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

    void info() {
        System.out.println("Автомобиль :\n" +
                "Цвет : "+color+"\n" +
                "Мотор : "+engine+"\n" +
                "Кол-во дверей : "+doorCount+"\n");
    }
}

class CarTest {
    static void changeDoorCount(Car car, int dorCount) {
        car.doorCount = dorCount;
    }

    static void changeColors(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }
}

public class Test11 {

    public static void main(String[] args) {
        Car car1 = new Car("черный","v6",4);
        Car car2 = new Car("красный","v6",4);
        Car car3 = new Car("белый","v8",5);

        car1.info();
        car2.info();
        car3.info();

        System.out.println("------------ info -------------");

        CarTest.changeDoorCount(car1, 6);
        car1.info();

        CarTest.changeColors(car2, car3);
        car2.info();
        car3.info();

    }
}
