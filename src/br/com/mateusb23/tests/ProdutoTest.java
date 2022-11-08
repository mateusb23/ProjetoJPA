package br.com.mateusb23.tests;

import br.com.mateusb23.model.bean.Categoria;
import br.com.mateusb23.model.bean.Produto;
import br.com.mateusb23.model.dao.ProdutoDAO;

public class ProdutoTest {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		Categoria categoria = new Categoria();
		categoria.setId(2);
		
		Produto produto = new Produto();
		produto.setDescricao("Cuzcuz");
		produto.setQuantidade(14);
		produto.setValor(3.85);
		produto.setCategoria(categoria);
		
		dao.save(produto);
		
	}
	
}
