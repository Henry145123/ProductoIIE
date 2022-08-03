package com.idat.Producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.Producto.entity.Producto;
import com.idat.Producto.service.ProductoService;




@Controller
@RequestMapping( path = "/producto/v1")
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Producto>>  listar() {
		
		return new ResponseEntity<List<Producto>>(service.listarProductos(), HttpStatus.OK) ;
	}
	
	
}
