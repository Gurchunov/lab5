package com.company.teachmeskills.animal;

public class Cat extends Animal {

    public Cat(String food, String location, String nameAnimal) {
        super(food, location, nameAnimal);
    }


    @Override
    public String makeNoise() {
        return super.makeNoise() + " мяу";
    }

    @Override
    public void eat() {
        System.out.println("Это животное ест " + food);
    }
}
