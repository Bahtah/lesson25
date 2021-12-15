package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> lisofAnimal = new ArrayList<>();
        lisofAnimal.add(new Animal(1, "Kit"));
        lisofAnimal.add(new Animal(2, "Akula"));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1, "Aktosh"));
        listOfDogs.add(new Dog(2, "Koktosh"));

        test(lisofAnimal);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
            System.out.println(animal);
        }
    }

    public static int gipotenuza(int a, int b){
        int c = (a * a) + (b * b);
        int res = (int) Math.sqrt(c);
        return res;
    }
}
