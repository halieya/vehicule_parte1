package com.cubeIt.testapi.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "vehicules")
@Data @NoArgsConstructor @AllArgsConstructor
public class Vehicule { 

    @Id
    private String id;

    private String marque;
    private String modele;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datefab;
    
    private String nbrportes;
    private String prix;

    public Vehicule( String marque, String modele, Date datefab, String nbrportes, String prix) {
		super();
		
		this.marque = marque;
		this.modele = modele;
		this.datefab = datefab;
		this.nbrportes = nbrportes;
		this.prix = prix;
	}





}
