/*
package ru.artemk;

public class Employee {
    int id;
    public String surname;
    String department;
    int age;
    private double salary;

    public Employee(int id, String surname) {
        this(id, surname, null, 0, 0.0);
    }

    private Employee(String surname, double salary) {
        this(0, surname, null, 0, salary);
    }

    Employee(int id, String surname, String department, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public void showSurname() {
        System.out.println(this.surname);
    }

    public void showID() {
        System.out.println(this.id);
    }

    public void showSalary() {
        System.out.println(this.salary);
    }

    void upSalary() {
        this.salary = this.salary * 2;
    }

    void info() {
        System.out.println(String.format("Сотрудник %s :\n" +
                "\tОтдел - %s,\n" +
                "\tВозраст - %d лет,\n" +
                "\tОклад - %.2f \u20BD.", this.surname, this.department, this.age, this.salary));
    }
}
*/
