package ru.artemk;

class Summ {

    void sum() {
        System.out.println("Сумма равна : 0.");
    }

    void sum(int i1){
        System.out.println("Сумма 1-го равна : " + i1);
    }

    void sum(int i1, int i2) {
        int output = i1 + i2;
        System.out.println("Сумма 2-х равна : " + output);
    }

    void sum(int i1, int i2, int i3){
        int output = i1 + i2 + i3;
        System.out.println("Сумма 3-х равна : " + output);
    }

    void sum(int i1, int i2, int i3, int i4) {
        int output = i1 + i2 + i3 + i4;
        System.out.println("Сумма 4-х равна : " + output);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Summ s1 = new Summ();
        s1.sum();
        s1.sum(1);
        s1.sum(1,2);
        s1.sum(1,2,3);
        s1.sum(1,2,3,4);
    }
}

