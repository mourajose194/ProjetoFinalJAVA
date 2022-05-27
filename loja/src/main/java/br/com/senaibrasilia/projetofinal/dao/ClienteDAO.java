package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;

import javax.persistence.Entity;

import br.com.senaibrasilia.projetofinal.model.Cliente;
import javax.persistence.EntityManager;

public class ClienteDAO {
	
	private EntityManager  em;
	
	public ClienteDAO(EntityManager em2) {
		// TODO Auto-generated constructor stub
		this.em=em2;
	}

	public void cadastrar(Cliente cliente) {
		//persist
	this.em.persist(cliente);
		
	}
	
	public void alterar(Cliente cliente) {
		//merger
		this.em.merge(cliente);
		
		
	}
    public List<Cliente> pesquisarPorCodigo(Long id) {
    	//find
    	String jpql= "SELECT c FROM Cliente c Where c.id=:id";
    	return em.createQuery(jpql, Cliente.class).setParameter("id",id).getResultList();
    	
    }
    public void pesquisarPorNome() {
    	
    	
    }
    
    public void pesquisarPorTodos() {
    	//query JQL
    	//arraylist
    	//Lambda
    	
    }

}
