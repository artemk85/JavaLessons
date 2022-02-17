/*
package ru.artemk;

class BankAccount {
    int id;
    String name;
    double balance;

    BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    double popolnenieScheta(double sum) {
        this.balance += sum;
        return this.balance;
    }

    double snyatieSoScheta(double sum) {
        this.balance -= sum;
        return this.balance;
    }

    void info() {
        System.out.println(String.format("Баланс гражданина %s = %.2f $.", this.name, this.balance));
    }
}

public class Test5 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1, "Артем", 100.5);
        BankAccount ba2 = new BankAccount(2, "Мурат", 64.1);
        BankAccount ba3 = new BankAccount(3, "Сильвестр", 77.0);

        ba1.info();
        ba2.info();
        ba3.info();

        ba1.popolnenieScheta(10);
        ba2.popolnenieScheta(10);
        ba3.popolnenieScheta(10);

        ba1.info();
        ba2.info();
        ba3.info();

        ba1.snyatieSoScheta(20);
        ba2.snyatieSoScheta(20);
        ba3.snyatieSoScheta(20);

        ba1.info();
        ba2.info();
        ba3.info();

        Employee emp1 = new Employee(1, "Иванов");
        Employee emp2 = new Employee(2, "Петров", "Отдел разработки", 23, 17500);
        Employee emp3 = new Employee(3, "Щварценегер", "Руководство", 45, 125000.67);

        System.out.println("Список сотрудников :");
        emp1.info();
        emp2.info();
        emp3.info();

        emp2.upSalary();
        emp2.info();
    }
}*/
