package ru.artemk;

public class Test12 {

    static void equalsStudents(Student st1, Student st2) {
        if (st1.equals(st2))
            System.out.println("студент 1 РАВЕН студенту 2");
        else
            System.out.println("студент 1 НЕ РАВЕН студенту 2");
    }

    static void equalsStudents2(Student st1, Student st2) {
        if (st1.numStudBil == st2.numStudBil) {
            if (st1.fio.equals(st2.fio)) {
                if (st1.name.equals(st2.name)) {
                    if (st1.year == st2.year) {
                        if (st1.srInYaz == st2.srInYaz) {
                            if (st1.srEkon == st2.srEkon) {
                                if (st1.srMath == st2.srMath) {
                                    System.out.println("студент 1 РАВЕН студенту 2");
                                } else System.out.println("Средняя оценка по математике студентов различаются !");
                            } else System.out.println("Средняя оценка по экономике студентов различаются !");
                        } else System.out.println("Средняя оценка по ин.язу студентов различаются !");
                    }  else System.out.println("Годы поступления студентов различаются !");
                } else System.out.println("Имена студентов различаются !");
            } else System.out.println("ФИО студентов различаются !");
        } else System.out.println("Номера студенческих билетов различаются !");
    }


    public static void main(String[] args) {
        Student st1 = new Student(1, 2019, "Ivan", "Ivanov", 4.9, 4.5, 4.1);
        Student st2 = new Student(1, 2019, "Ivan", "Ivanov", 4.9, 4.5, 4.1);
        Student st3 = new Student(1, 2019, "Ivan", "Petrov", 4.1, 4.2, 4.3);

        Test12.equalsStudents(st1, st2);
        Test12.equalsStudents(st1, st3);
        Test12.equalsStudents2(st1,st2);
        Test12.equalsStudents2(st1,st3);
    }
}
