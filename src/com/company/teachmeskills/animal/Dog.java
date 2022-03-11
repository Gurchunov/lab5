package com.company.teachmeskills.animal;


public class Dog extends Animal {

    public Dog(String food, String location, String nameAnimal) {
        super(food, location, nameAnimal);
    }


    @Override
    public String makeNoise() {
        return super.makeNoise() + " гав";
    }

    @Override
    public void eat() {
        System.out.println("Это животное ест " + food);
    }
}
