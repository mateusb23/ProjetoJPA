package br.com.mateusb23.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.mateusb23.connection.ConnectionFactory;
import br.com.mateusb23.model.bean.Produto;

public class ProdutoDAO {

	public Produto save(Produto produto) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		try {
			em.getTransaction().begin();
			if (produto.getId() == null) {
				em.persist(produto);
			} else {
				em.merge(produto);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

		return produto;
	}

	public Produto findById(Integer id) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		Produto produto = null;

		try {
			produto = em.find(Produto.class, id); 
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			em.close();
		}

		return produto;
	}

	@SuppressWarnings("unchecked")
	public List<Produto> findAll() {

		EntityManager em = new ConnectionFactory().getEntityManager();

		List<Produto> produtos = null;

		try {
			produtos = em.createQuery("from Produto").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return produtos;
	}

	public Produto remove(Integer id) { 

		EntityManager em = new ConnectionFactory().getEntityManager();

		Produto produto = null;
		
		try {
			produto = em.find(Produto.class, id);
			
			em.getTransaction().begin();
			em.remove(produto);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

		return produto;
	}
		
}

