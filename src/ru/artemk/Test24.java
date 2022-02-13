package ru.artemk;

abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi.");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }
    void speak() {
        System.out.println("Bird " + this.name + " sings.");
    }
    abstract void fly();
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    void eat() {
        System.out.println("Mechenosec ne hischnaya riba, i ona est obichniy ribiy korm.");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}

interface Speakable {
    default void speake() {
        System.out.println("Somebody speaks.");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Pingvin lyubit est ribu.");
    }
    void sleep() {
        System.out.println("Pingvini spyat prizavshis drug k drugu.");
    }
    void fly(){
        System.out.println("Pingvini ne umeyut letat.");
    }
    public void speake() {
        System.out.println("Pingvini ne umeyut pet kak solovyi.");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Lev, kak lyuboi hischnik, lyubit myaso.");
    }
    void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit.");
    }
    void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka.");
    }
}

public class Test24 {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Меченосец");
        System.out.println(m1.name);
        m1.eat();
        m1.swim();
        m1.sleep();
        System.out.println();

        Speakable p1 = new Pingvin("Пингвинчик");
        p1.speake();
        System.out.println();

        Animal a1 = new Lev("Львенок");
        a1.eat();
        a1.sleep();
        System.out.println();

        Mammal m2 = new Lev("Другой Львенок");
        m2.run();
        m2.speake();
        m2.eat();
        m2.sleep();
    }
}