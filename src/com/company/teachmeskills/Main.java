package com.company.teachmeskills;

import com.company.teachmeskills.animal.Animal;
import com.company.teachmeskills.animal.Cat;
import com.company.teachmeskills.animal.Dog;
import com.company.teachmeskills.animal.Horse;
import com.company.teachmeskills.clinic.Vet;

public class Main {

    public static void main(String[] args) {
        Vet vet = new Vet();

        Animal[] animals = new Animal[]{
                new Dog("мясо", "будка", "собака"),
                new Cat("молока", "кровать", "кот"),
                new Horse("морковь", "стойло", "лошадь")
        };
        for (Animal an : animals) {
            vet.treatAnimal(an);
        }
    }
}
