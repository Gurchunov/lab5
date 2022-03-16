package com.company.teachmeskills.animal;


public class Dog implements Animal {

    private String food;
    private String location;
    private String nameAnimal;

    public Dog(String food, String location, String nameAnimal) {
        this.food = food;
        this.location = location;
        this.nameAnimal = nameAnimal;
    }

    @Override
    public String makeNoise() {
        return nameAnimal + " делает гав";
    }

    @Override
    public void eat() {
        System.out.println("Это животное ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println(nameAnimal + " животное спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
