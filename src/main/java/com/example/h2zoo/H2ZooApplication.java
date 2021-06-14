package com.example.h2zoo;

import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);

		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile comodoDragon = new Reptile("Charlie", "Lizard", "Black", "Carnivore");
		Reptile mamba = new Reptile("Killer", "Snake", "Black", "Carnivore");
		Reptile kangaroo = new Reptile("Jack", "Mammal", "Brown", "Omnivore");
		Reptile blueWhale = new Reptile("Big Blue", "Mammal", "Blue", "Carnivore");
		Reptile amazonDolphin = new Reptile("River Dolphin", "Mammal", "Pink", "Carnivore");


		reptileRepository.saveAll(List.of(kingCobra, comodoDragon, mamba, kangaroo, blueWhale, amazonDolphin));
	}

}
