package com.zookeper.zookeper;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooAnimalController {
    @GetMapping("/animals")
    public ArrayList<Animal> getAnimals() {

        ArrayList<Animal> animals = new ArrayList<>();

        Animal animal = new Animal(1, "Tom", "Cat", true);
        Animal animal1 = new Animal(2, "Jerry", "Mouse", true);

        animals.add(animal);
        animals.add(animal1);
        return animals;

    }
}

class Animal {
    public Integer id;
    public String name;
    public String species;
    public Boolean isHungry;

    public Animal(Integer id, String name, String species, boolean isHungry) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.isHungry = isHungry;

    }

}