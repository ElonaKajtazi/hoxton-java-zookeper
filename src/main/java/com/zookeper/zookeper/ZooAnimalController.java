package com.zookeper.zookeper;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooAnimalController {
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animals")
    public List<Animal> getAnimals() {
        return animalRepository.findAll();

    }

    @PostMapping("/animals")
    public Animal creaAnimal(@RequestBody Animal animalData) {
        return animalRepository.save(animalData);
    }

    @DeleteMapping("/animals/{id}")
    public String deleteAnimal(@PathVariable Integer id) {
       animalRepository.deleteById(id);

       return "Successfully deleted";
    }

    @PatchMapping("/animals/{id}")
    public Animal updAnimal (@RequestBody Animal animalData, @PathVariable Integer id){
        animalData.id = id;
       return animalRepository.save(animalData);

    }
}

@Entity
class Animal {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public String species;
    public Boolean isHungry;

    public Animal() {

    }

}

interface AnimalRepository extends JpaRepository<Animal, Integer> {
};