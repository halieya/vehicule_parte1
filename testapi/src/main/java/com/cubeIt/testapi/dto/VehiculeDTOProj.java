package com.cubeIt.testapi.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public interface VehiculeDTOProj {

	
	@Value("#{target.id}")
	String getId();
	String getMarque();
	String getModele();
	
	
	Date getDatefab();
}
