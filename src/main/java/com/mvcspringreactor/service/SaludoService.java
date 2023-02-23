package com.mvcspringreactor.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
	
	public String hola() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "hola sincrono";
	}
	public String hola2() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "hola sincrono 2 ";
	}
	
	
}

