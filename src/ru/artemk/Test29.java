package ru.artemk;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test29 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee("Ivan", "Rukovodstvo", 1250.75);
        Employee emp2 = new Employee("Lyudmila", "Buh", 700.50);
        Employee emp3 = new Employee("Petr", "Proizvodstvo", 450.50);
        Employee emp4 = new Employee("Elena", "Buh", 350.0);
        Employee emp5 = new Employee("Inokentiy", "IT", 640.22);
        Employee emp6 = new Employee("AHO", "AHO", 333.33);
        Employee emp7 = new Employee("Василий", "AHO", 333.33);
        Employee emp8 = new Employee("Ерема", "IT", 190.22);

        empList.add(emp1); empList.add(emp2); empList.add(emp3); empList.add(emp4);
        empList.add(emp5); empList.add(emp6); empList.add(emp7); empList.add(emp8);

        TestEmployee tEmp = new TestEmployee();
        tEmp.filterRabotnikov(empList, employee -> {return (employee.getDepartment().toString().equals("IT") && employee.getSalary() > 200);});
        tEmp.filterRabotnikov(empList, employee -> {return (employee.getName().toString().startsWith("E") && employee.getSalary() < 450);});
        tEmp.filterRabotnikov(empList, employee -> {return (employee.getDepartment().toString().equals(employee.getName().toString()));});
    }
}

class Employee {
    private String name;
    private String department;
    private double salary;

    Employee(String name, String department, double salary) {
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
        else throw new IllegalArgumentException("Значение зарплаты не должно быть меньше 0 !");
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(this.name);
        return sb;
    }

    public double getSalary() {
        return salary;
    }

    public StringBuilder getDepartment() {
        StringBuilder sb = new StringBuilder(this.department);
        return sb;
    }
}

class TestEmployee {
    void printEmployee(Employee employee) {
        System.out.println("Сотрудник : "+employee.getName()+", Отдел : "+employee.getDepartment()+", Зарплата : "+employee.getSalary()+".");
    }

    void filterRabotnikov(ArrayList<Employee> aE, Predicate<Employee> predicate) {
        for (Employee emp: aE)
            if (predicate.test(emp)) {
                printEmployee(emp);
            }
    }
}
