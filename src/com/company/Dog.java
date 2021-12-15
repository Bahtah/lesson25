package com.company;

public class Dog extends Animal{
    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("Dog eating...");
    }
}
