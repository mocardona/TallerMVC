package com.mvcspringreactor.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvcspringreactor.service.SaludoServiceReactivo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SaludoReactivoController {
	@Autowired 
	SaludoServiceReactivo saludo;
	
	@RequestMapping("/hola-asincrono")
	public Mono<String> hola(){
		return saludo.hola();
		
		
	}
	@RequestMapping("/hola2-asincrono")
	public Mono<String> hola2(){
		return saludo.hola2();
		
		
	}
	@RequestMapping("/holas-asincrono")
	public Mono<Object> holas(){
	
		List<String> lista = new ArrayList<>();
		
			if (lista.size()>0 ) {
				return Flux.just(lista).collect(Collectors.reducing((i1,i2)->i1)).map(op->op.get());
				
			}
			else { return Mono.just("no hay datos");
				
			}
		}	
	}


