package br.com.mateusb23.model.dao;

import javax.persistence.EntityManager;

import br.com.mateusb23.connection.ConnectionFactory;
import br.com.mateusb23.model.bean.Produto;

public class ProdutoDAO {

	public Produto save(Produto produto) {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		return produto;
	}
	
}
