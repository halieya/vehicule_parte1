package com.cubeIt.testapi.services.interfaces;

import java.util.List;

import com.cubeIt.testapi.models.Vehicule;

public interface IVehiculeService {
	
   Vehicule addVehicule(Vehicule v);
   Vehicule udateVehicule(Vehicule v);
   Vehicule retrieveVehicule(String id);
   List<Vehicule>retrieveAllVehicules();
   List<Vehicule>retrieveAllVehiculesByName(String marque);
   void deleteVehicule(String id);
}
