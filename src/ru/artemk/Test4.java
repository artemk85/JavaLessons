package ru.artemk;

import static java.lang.Math.abs;

class Student {
    int numStudBil, year;
    String name, fio;
    double srMath, srEkon, srInYaz;

    Student() {
    }

    Student(int numStudBil, String name, String fio, int year) {
        this(numStudBil, year, name, fio, 0.0, 0.0, 0.0);
    }

    Student(int numStudBil, int year, String name, String fio, double srMath, double srEkon, double srInYaz) {
        this.numStudBil = numStudBil;
        this.year = year;
        this.name = name;
        this.fio = fio;
        this.srMath = srMath;
        this.srEkon = srEkon;
        this.srInYaz = srInYaz;
    }

    boolean equals(Student st1, Student st2) {
        if (st1.numStudBil == st2.numStudBil) {
            if (st1.fio.equals(st2.fio)) {
                if (st1.name.equals(st2.name)) {
                    if (st1.year == st2.year) {
                        if (st1.srInYaz == st2.srInYaz) {
                            if (st1.srEkon == st2.srEkon) {
                                if (st1.srMath == st2.srMath) return true;
                                else return false;
                            } else return false;
                        } else return false;
                    } else return false;
                } else return false;
            } else return false;
        } else return false;
    }

    void info() {
        System.out.println("1. " + this.fio + " " + this.name + " : " +
                String.format("%.2f",(this.srInYaz + this.srMath + this.srEkon)/3));
    }
}

public class Test4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.numStudBil = 1;
        student1.name = "Иван";
        student1.fio = "Иванов";
        student1.year = 2020;
        student1.srMath = 4.3;
        student1.srEkon = 4.7;
        student1.srInYaz = 4.9;

        student2.numStudBil = 2;
        student2.name = "Петр";
        student2.fio = "Петров";
        student2.year = 2019;

        System.out.println("Общая средняя оценка студентов : ");
        student1.info();
        student2.info();
        student3.info();
    }
}
