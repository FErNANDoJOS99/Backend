package com.product;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/")
public class CtrlProduct {
	
	
	
	
	@GetMapping( "/category")
	public String category() {
		
		//Para metodos didacticos voy a agregar 2 categorias solo pa que la lista no 
		//este vacia

		Almacen almacen =new Almacen();
		almacen.createCategory("categoria1","tag1");
		almacen.createCategory("categoria2", "tag2");
		
		
		return ""+almacen.getCategories();
	}
}
