package com.zookeper.zookeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Instructions
// - Start a new Maven project ✅
// - Make sure you have all dependencies in place - Spring web, H2, Hibernate. ✅
// - Create a ZooAnimal class - id, name, species, origin, isHungry. ✅
// - Seed your app with some data ✅
// - Make sure your data is persisted when you restart your server. ✅
// - Build a full CRUD for the animals ✅
@SpringBootApplication
public class ZookeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeperApplication.class, args);
	}

}
