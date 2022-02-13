package ru.artemk;

class kkkk {

}

class classTest1 {
    int a = 1;
    static int c = 2;

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        classTest1 t1 = new classTest1();
        t1.abc(3);
    }
}

class classTest2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(classTest2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

class classTest3 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(classTest3.b);
    }

    public static void main(String[] args) {
        classTest3 t3 = new classTest3();
        t3.abc(4);
    }
}

public class Test9 {
    public static void main(String[] args) {
        kkkk k1 = new kkkk();
        kkkk k2 = new kkkk();
        kkkk k3 = new kkkk();
        kkkk k4 = new kkkk();
        kkkk k5;
        kkkk k6 = new kkkk();
        kkkk k7;
        kkkk k8 = new kkkk();

        k1 = null;
        k2 = null;
        k3 = null;
        k4 = null;
    }
}

