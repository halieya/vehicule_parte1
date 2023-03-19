package com.cubeIt.testapi.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cubeIt.testapi.dto.VehiculeDTOProj;
import com.cubeIt.testapi.models.Vehicule;
import com.cubeIt.testapi.repositories.VehiculeRepository;
import com.cubeIt.testapi.services.interfaces.IVehiculeService;
@CrossOrigin("*")
@RestController
@RequestMapping("cubeit/api/vehicules")


public class VehiculeRestController {
	
	@Autowired 
	private VehiculeRepository vehiculeRepository;
    
	@Autowired 
	private IVehiculeService vehiculeService ;
	
//	API FINDALL Vehicules
	@GetMapping("/all")
	@ResponseBody
	public List<Vehicule> getVehicules(){
		
		List<Vehicule> vehicules=vehiculeRepository.findAll();
		
		return vehicules;
	}
//	API FINDALL Vehicule By ID
	@GetMapping("/find-one/{id}")
	@ResponseBody
	public Vehicule getVehiculeById(@PathVariable("id") String id){
		
/*		Vehicule vehicule =vehiculeService.retrieveVehicule(id);
		
		return vehicule;*/
		
		return vehiculeService.retrieveVehicule(id);
	}
	
//	API Create Vehicule
	@PostMapping("/create-one")
	@ResponseBody
	public Vehicule createOne(@RequestBody Vehicule v){
		
		vehiculeService.addVehicule(v);
		
		return v;
	}
	
//	API Update Vehicule
	@PutMapping("/update-one")
	@ResponseBody
	public Vehicule updateOne(@RequestBody Vehicule v){
		
		vehiculeService.udateVehicule(v);
		
		return v;
	}
	
	
/*	
//	API Delete Vehicule By ID
	@DeleteMapping("/delete-one/{id}")
	@ResponseBody
	public String deleteClientById(@PathVariable ("id")String id){
		
		Vehicule vehicule=vehiculeService.retrieveVehicule(id);
		vehiculeService.deleteVehicule(id);
		
		return "Vehicule:"+vehicule+"DeleteSuccessfully";
	}
	
*/	
	
//	API Delete Vehicule By ID
	@DeleteMapping("/delete-one/{id}")
	@ResponseBody
	public void deleteClientById(@PathVariable ("id")String id){
		
		
		vehiculeService.deleteVehicule(id);
}

//	API FINDALL Vehicules by name
	@GetMapping("/all/byname/{marque}")
	@ResponseBody
	public List<Vehicule> getVehiculesByName(@PathVariable("marque")String marque){
		
		List<Vehicule> vehicules=vehiculeService.retrieveAllVehiculesByName(marque);
		
		return vehicules;
	}
//	API FINDALL Vehicules by name
	@GetMapping("/all/byname/{modele}")
	@ResponseBody
	public List<Vehicule> getVehiculesByModele(@PathVariable("modele")String modele){
		
		List<Vehicule> vehicules=vehiculeService.retrieveAllVehiculesByName(modele);
		
		return vehicules;
	}
	
//	API FINDALL Vehicules with specific Attributes
	@GetMapping("/all/mobile")
	@ResponseBody
	public List<VehiculeDTOProj> getVehiculesSpecificFields(){
		
		List<VehiculeDTOProj> vehicules=vehiculeRepository.findAllSpecificFields();
		
		return vehicules;
	}

}
