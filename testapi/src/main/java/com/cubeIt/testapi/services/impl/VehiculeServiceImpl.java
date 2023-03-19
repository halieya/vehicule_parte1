package com.cubeIt.testapi.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubeIt.testapi.models.Vehicule;
import com.cubeIt.testapi.repositories.VehiculeRepository;
import com.cubeIt.testapi.services.interfaces.IVehiculeService;

@Service
public class VehiculeServiceImpl implements IVehiculeService{
	
	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	
	@Override
	public List<Vehicule> retrieveAllVehicules() {
		
		List<Vehicule> vehicules=vehiculeRepository.findAll();
		return vehicules;
	}

	@Override
	public Vehicule addVehicule(Vehicule v) {
		vehiculeRepository.save(v);
		return v;
	}

	@Override
	public Vehicule udateVehicule(Vehicule v) {
		vehiculeRepository.save(v);
		return v;
	}


    @Override
	public Vehicule retrieveVehicule(String id) {
		Vehicule v=vehiculeRepository.findById(id).get();
		
		return v;
	}
    

	@Override
	public void deleteVehicule(String id) {
		vehiculeRepository.deleteById(id);
		
	}

	@Override
	public List<Vehicule> retrieveAllVehiculesByName(String marque) {
		List<Vehicule> vehicules=vehiculeRepository.findByMarque(marque);

		return vehicules;
	}


	
}
