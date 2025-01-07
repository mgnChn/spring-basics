package com.megandemo;

public class Dev {

    Computer computer;
//    Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(Integer age){
        this.age = age;
        System.out.println("Dev constructor with age: " + age);
    }

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//        System.out.println("Dev constructor with laptop");
//    }

    public void build() {
        System.out.println("Building the project...");
        computer.compile();
//        laptop.compile();
    }

    // Getter and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}

