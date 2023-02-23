package com.mvcspringreactor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvcspringreactor.modelo.FiguraEntity;
import com.mvcspringreactor.service.FiguraService;


@RestController
@RequestMapping("/api/figuras")
public class FiguraController {
	// volver  a subir modificado
	@Autowired
	FiguraService servicio;
	@PostMapping("/crear-figura")
	public boolean agregarFigura(@RequestBody FiguraEntity figura) {
		return servicio.crearFigura(figura);
	}
	
	@GetMapping("/obtener-figuras")
	public  List<FiguraEntity> obtenerFiguras(){
		return servicio.obtenerFigura();
	}
	
@DeleteMapping("/eliminar-figura")
  public boolean eliminarFiura(int id) {
	return servicio.eliminarFigura(id);
}
}
