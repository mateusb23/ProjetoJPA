package br.com.mateusb23.tests;

import br.com.mateusb23.model.bean.Categoria;
import br.com.mateusb23.model.bean.Produto;
import br.com.mateusb23.model.dao.ProdutoDAO;

public class ProdutoTest {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		/*Categoria categoria = new Categoria();
		categoria.setId(4);
		
		Produto produto = new Produto();
		produto.setId(1);
		produto.setDescricao("Milho");
		produto.setQuantidade(7);
		produto.setValor(3.25);
		produto.setCategoria(categoria);
		
		dao.save(produto);*/
		
		/*Categoria categoria = new Categoria();
		categoria.setId(1);
		
		Produto produto = new Produto();
		//produto.setId(1);
		produto.setDescricao("Heineken long neck");
		produto.setQuantidade(12);
		produto.setValor(5.99);
		produto.setCategoria(categoria);
		
		dao.save(produto);*/
		
		//Produto produto = dao.findById(2);
		
		/*System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: " + produto.getValor());
		System.out.println("Categoria: " + produto.getCategoria().getDescricao());*/
		
		//System.out.println(produto);
		
		for (Produto p: dao.findAll()) {
			System.out.println();
			System.out.println("Categoria; " + p.getCategoria().getDescricao());
			System.out.println("Descrição: " + p.getDescricao());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Valor: " + p.getValor());
		}
		
		//dao.remove(1);
		
	}
	
}



