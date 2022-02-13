package ru.artemk;

class Student3 {
    private StringBuilder name;
    private int course;
    private int grade;

    public void setCourse(int course) {
        if (course >= 1 && course <= 4)
            this.course = course;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10)
            this.grade = grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(this.name);
        return sb;
    }

    public void showInfo() {
        System.out.println("Студент : " + getName());
        System.out.println("Оценка = " + getGrade());
        System.out.println("Курс : " + getCourse());
    }
}

class Animal1 {
    private int eyes;

    Animal1() {
        System.out.println("I am animal !");
    }

    public void eat() {
        System.out.println("Animal eating.");
    }

    public void drinks() {
        System.out.println("Animal drinks.");
    }

    public void setEyes(int eyes) {
        if (eyes>0)
            this.eyes = eyes;
    }
}

class Cat extends Pet {
    Cat(StringBuilder name) {
        System.out.println("I am cat and my name is "+name);
    }
    public void sleep() {
        System.out.println("Cat sleeps.");
    }
}

class Dog extends Pet {
    Dog(StringBuilder name) {
        System.out.println("I am dog and my name is "+name);
    }

    public void play() {
        System.out.println("Dog plays.");
    }
}

class Pet extends Animal1 {
    private StringBuilder name;
    private int tail = 1;
    private int paw = 4;

    Pet() {
        this.setEyes(2);
        System.out.println("I am Pet !");
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public void run() {
        System.out.println("Pet is runs");
    }

    public void jump() {
        System.out.println("Pet is jumps");
    }

    public int getPaw() {
        return paw;
    }

    public int getTail() {
        return tail;
    }
}

public class Test22 {
    public static void main(String[] args) {
        Student3 st = new Student3();
        st.setCourse(34);
        st.setGrade(-111);
        st.setName(new StringBuilder("Homyak"));
        st.getName().append("gggggg");
        st.showInfo();

        Dog dog = new Dog(new StringBuilder("Barsik"));
        System.out.println("У собаки "+dog.getPaw()+" лапы.");

        Cat cat = new Cat(new StringBuilder("Kisa"));
        cat.sleep();
    }
}
