package com.cubeIt.testapi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.cubeIt.testapi.models.Vehicule;
import com.cubeIt.testapi.repositories.VehiculeRepository;

@SpringBootApplication
public class TestapiApplication implements CommandLineRunner{
	/*
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	*/
	
	
	private final VehiculeRepository vehiculeRepository;
	
	@Autowired
	public TestapiApplication(VehiculeRepository vehiculeRepository) {
		
		this.vehiculeRepository=vehiculeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	
	Date date=new Date();
		System.out.println("###########saving vehicules###############");
		
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		*/
		
		
		//restConfiguration.exposeIdsFor(Vehicule.class);
		System.out.println("###########Spring Start###############");
		
		
	}

}
