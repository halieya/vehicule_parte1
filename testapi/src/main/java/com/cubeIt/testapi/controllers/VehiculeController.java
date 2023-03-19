package com.cubeIt.testapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cubeIt.testapi.models.Vehicule;
import com.cubeIt.testapi.repositories.VehiculeRepository;

@Controller
public class VehiculeController{
     
	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	@GetMapping("/vehicule")
	public String VehiculesView(Model model) {
		
		model.addAttribute("vehicules", vehiculeRepository.findAll());
		model.addAttribute("v",new Vehicule());
		//model.addAttribute("vehicules", vehiculeRepository.findAll(Sort.by(Sort.Direction.DESC,"id")));

		
		return"vehicule";
	}
	
	
	
	@PostMapping("/create-vehicule")
	public String addVehicule(@ModelAttribute Vehicule v, final RedirectAttributes redirectAttributes) {
		
		vehiculeRepository.save(v);
		
		redirectAttributes.addFlashAttribute("message_ajout","vehicule Created Successfuly !!");
		return"redirect:/vehicule";
	}
	
	
	@GetMapping("/update-vehicule")
	public String upadateVehicule(@Validated Vehicule v, final RedirectAttributes redirectAttributes) {
		
		vehiculeRepository.save(v);
		
		redirectAttributes.addFlashAttribute("message_edit","vehicule Modified Successfuly !!");
		return"redirect:/vehicule";
	}
	
	
	
	
	
	@GetMapping("/delete-vehicule")
	public String deleteVehicule(@RequestParam String id, final RedirectAttributes redirectAttributes) {
		
		vehiculeRepository.deleteById(id);
		
		redirectAttributes.addFlashAttribute("message_delete","vehicule Deleted Successfuly !!");
		return"redirect:/vehicule";
	}
	
	
	
	
	
	
	
}
