package com.product.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.entity.Category;
import com.product.api.repository.RepoCategory;

@Service
public class SvcCategoryImp implements SvcCategory{

	//Que esto se ocupa para hacer la inyeccion de dependencias.
	@Autowired
	RepoCategory repo;
	
	
	/*
	 * El método lo que hace es retornar directamente
	 *  lo que devuelve el método getRegions del
	 * repositorio.
	 * */
	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		
		return repo.getCategories();
	}	

}
