package com.mvcspringreactor.repository;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mvcspringreactor.modelo.FiguraEntity;

@Repository
public class FakeRepository {
	private List<FiguraEntity> figuras = new ArrayList<FiguraEntity>();
	
	public boolean agreagarFigura(FiguraEntity figura) {
		try {
			figuras.add(figura);
			return true;
			
		} catch (Exception e) {
			return false;
			
		}
	}
	
 public FiguraEntity buscarFigura(int id) {
       return figuras.stream().filter(x-> x.getId()== id)
 		.reduce((x1,x2)->x1).orElse(null);
 }

	public List<FiguraEntity> traerFiguras(){
		return figuras;
	}
		
	public boolean eliminarFigura(int id) {
		return figuras.removeIf(figuras->figuras.getId()==id);
		
	}
 }

