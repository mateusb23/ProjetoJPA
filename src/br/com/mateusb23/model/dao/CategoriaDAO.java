package br.com.mateusb23.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.mateusb23.connection.ConnectionFactory;
import br.com.mateusb23.model.bean.Categoria;

public class CategoriaDAO {

	public Categoria save(Categoria categoria) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		try {
			em.getTransaction().begin();
			if (categoria.getId() == null) {
				em.persist(categoria);
			} else {
				em.merge(categoria);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

		return categoria;
	}
	
	public Categoria findById(Integer id) {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		Categoria categoria = null;
		
		try {
			categoria = em.find(Categoria.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return categoria;
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> findAll() {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		List<Categoria> categorias = null;
		
		try {
			categorias = em.createQuery("from Categoria").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return categorias;
	}
	
	public Categoria remove(Integer id) {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		Categoria categoria = null;
		
		 try {
			categoria = em.find(Categoria.class, id);
			
			em.getTransaction().begin();
			em.remove(categoria);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		return categoria;
	}

}

