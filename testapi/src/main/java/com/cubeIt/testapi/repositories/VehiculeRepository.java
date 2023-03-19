package com.cubeIt.testapi.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cubeIt.testapi.dto.VehiculeDTOProj;
import com.cubeIt.testapi.models.Vehicule;

/*
@CrossOrigin("*")
@RestResource*/
public interface VehiculeRepository extends MongoRepository <Vehicule,String>{

	List<Vehicule> findByMarque(String marque);

	List<Vehicule> findByModele(String modele);

	@Query("SELECT*FROM vehicules")
	List<VehiculeDTOProj> findAllSpecificFields();
    
}
