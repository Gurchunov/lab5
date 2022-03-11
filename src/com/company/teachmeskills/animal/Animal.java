package com.company.teachmeskills.animal;

public abstract class Animal {

    protected String food;
    protected String location;
    protected String nameAnimal;

    public Animal(String food, String location, String nameAnimal) {
        this.food = food;
        this.location = location;
        this.nameAnimal = nameAnimal;
    }

    public String makeNoise() {
        return nameAnimal + " делает";
    }


    public abstract void eat();

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
