package br.com.mateusb23.tests;

import javax.persistence.EntityManager;

import br.com.mateusb23.connection.ConnectionFactory;
import br.com.mateusb23.model.bean.Categoria;
import br.com.mateusb23.model.dao.CategoriaDAO;

public class CategoriaTest {

	public static void main(String[] args) {
		
		CategoriaDAO dao = new CategoriaDAO();
		
		/*Categoria c1 = new Categoria();
		c1.setDescricao("Bebidas 1");
		Categoria c2 = new Categoria();
		c2.setDescricao("Bebidas 2");
		Categoria c3 = new Categoria();
		c3.setDescricao("Comidas");
		Categoria c3 = new Categoria();
		c3.setId(4);
		c3.setDescricao("Comidas");
		
		c1 = dao.save(c1);
		System.out.println("ID: " + c1.getId());
		System.out.println("Descrição: " + c1.getDescricao());
		
		c2 = dao.save(c2);
		System.out.println("ID: " + c2.getId());
		System.out.println("Descrição: " + c2.getDescricao());
		
		c3 = dao.save(c3);
		System.out.println("ID: " + c3.getId());
		System.out.println("Descrição: " + c3.getDescricao());
		
		Categoria  c = dao.findById(4);
		
		System.out.println("Descrição: " + c.getDescricao());
		
		for (Categoria c: dao.findAll()) {
			System.out.println("Descrição: " + c.getDescricao());
		}*/
		
		dao.remove(3);
		
	}
	
}
