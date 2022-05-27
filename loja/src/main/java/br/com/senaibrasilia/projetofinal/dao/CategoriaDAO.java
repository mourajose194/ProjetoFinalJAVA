package br.com.senaibrasilia.projetofinal.dao;
import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class CategoriaDAO {
	private EntityManager em;
	
public CategoriaDAO(EntityManager em) {
		
		this.em=em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
		
		
	}
	
	public void alterar(Categoria categoria) {
		//merger
		this.em.merge(categoria);
		
	}
	
	 public void remover(Categoria categoria) {
	    	
	    	categoria= em.merge(categoria);
	    	this.em.remove(categoria);
	    	
	    }
    public List<Categoria> pesquisarPorCodigo(Long id) {
    	   	//find
    	String jpql="SELECT c FROM Categoria c WHERE c.categoria.id=:id";
    	return  em.createQuery(jpql,Categoria.class).setParameter("id", id).getResultList(); 
    	
    }
    public List<Categoria> pesquisarPorNome(String nome) {
    	
    	String jpql = "SELECT c FROM Categoria c WHERE c.categoria.nome=:nome ";
    	return em.createQuery(jpql,Categoria.class).setParameter("nome",nome).getResultList();
    	
    	
    }
    
    public List<Categoria> pesquisarPorTodos() {
    	//query JQL
    	//arraylist
    	//Lambda
    	
    	String jpql= "SELECT c FROM Categoria c ";
    	return em.createQuery(jpql, Categoria.class).getResultList();
    	
    }
   

}
