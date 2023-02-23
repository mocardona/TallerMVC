package com.mvcspringreactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.mvcspringreactor.service.SaludoService;

@RestController
public class SaludoController {
	@Autowired
	
	SaludoService saludoService;
	
	@RequestMapping("/hola")
	public String hola() {
	 return saludoService.hola();
	 
 }
	@RequestMapping("/hola2")
	public String hola2() {
	 return saludoService.hola2();
	 
 }
	@RequestMapping("/holas")
	public String holas() {
	 long t1 = System.currentTimeMillis();
	 String texto = saludoService.hola()+""+saludoService.hola2();
	 Long t2 = System.currentTimeMillis();
	 
	 System.out.print(t2-t1);
	 return texto;
 }
}
