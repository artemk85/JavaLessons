package ru.artemk;

public class Test25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Mechenosec1");
        Animal a2 = new Pingvin("Pingvin1");
        Animal a3 = new Lev("Lev1");
        Fish f1 = new Mechenosec("Mechenosec2");
        Bird b1 = new Pingvin("Pingvin2");
        Mammal m1 = new Lev("Lev2");
        Mechenosec mech1 = new Mechenosec("Mechenosec3");
        Pingvin p1 = new Pingvin("Pingvin3");
        Lev l1 = new Lev("Lev3");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};

        Speakable sp1 = new Lev("Lev4");
        Speakable sp2 = new Pingvin("Pingvin4");
        Speakable[] array2 = {sp1, sp2, b1, m1, p1, l1};

        for (Animal animal: array1) {
            if (animal instanceof Mechenosec) {
                System.out.println(animal.name);
                animal.eat();
                animal.sleep();
                ((Mechenosec) animal).swim();
            } else if (animal instanceof Pingvin) {
                System.out.println(animal.name);
                animal.sleep();
                animal.eat();
                ((Pingvin) animal).speake();
                ((Pingvin) animal).speak();
                ((Pingvin) animal).fly();
            } else if (animal instanceof Lev) {
                System.out.println(animal.name);
                ((Lev) animal).speake();
                animal.eat();
                animal.sleep();
                ((Lev) animal).run();
            }
            System.out.println();
        }
        System.out.println();

        for (Speakable sp: array2) {
            if (sp instanceof Lev) {
                System.out.println(((Lev) sp).name);
                ((Lev) sp).eat();
                ((Lev) sp).run();
                ((Lev) sp).sleep();
                sp.speake();
            }
            if (sp instanceof Pingvin) {
                System.out.println(((Pingvin) sp).name);
                ((Pingvin) sp).speak();
                ((Pingvin) sp).eat();
                ((Pingvin) sp).sleep();
                ((Pingvin) sp).fly();
            }
            System.out.println();
        }
        System.out.println();
    }
}
