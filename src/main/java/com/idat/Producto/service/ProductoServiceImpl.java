package com.idat.Producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Producto.entity.Producto;
import com.idat.Producto.repository.ProductoRepository;



@Service
public class ProductoServiceImpl  implements ProductoService{

	@Autowired
	private ProductoRepository repository;
	

	@Override
	public List<Producto> listarProductos() {
		
		
		return repository.findAll();
	}

	

}
