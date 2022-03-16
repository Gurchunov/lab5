package com.company.teachmeskills.clinic;

import com.company.teachmeskills.animal.Animal;

public class Vet {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood());
        System.out.println(animal.getLocation());
    }
}

