package com.mvcspringreactor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcspringreactor.modelo.FiguraEntity;
import com.mvcspringreactor.repository.FakeRepository;

@Service
public class FiguraService {
	@Autowired
	public FakeRepository repositorio;
	
	public boolean crearFigura(FiguraEntity figura) {
		return repositorio.agreagarFigura(figura);	
	}
	public List<FiguraEntity> obtenerFigura(){
		return repositorio.traerFiguras();
	}
	public boolean eliminarFigura(int id) {
		return repositorio.eliminarFigura(id);
	}
}
