package com.company.teachmeskills.animal;

public class Horse extends Animal{

    public Horse(String food, String location, String nameAnimal) {
        super(food, location, nameAnimal);
    }


    @Override
    public String makeNoise() {
        return super.makeNoise() + " игого";
    }

    @Override
    public void eat() {
        System.out.println("Это животное ест " + food);
    }
}
