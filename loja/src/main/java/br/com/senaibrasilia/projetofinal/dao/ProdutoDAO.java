package br.com.senaibrasilia.projetofinal.dao;
import javax.persistence.EntityManager;
import java.util.List;
import br.com.senaibrasilia.projetofinal.model.Produto;

public class ProdutoDAO {
	private EntityManager em;
	
	public ProdutoDAO(EntityManager em) {
		// TODO Auto-generated constructor stub
		this.em=em;
	}

	public void cadastrar(Produto produto) {
		//persist
		this.em.persist(produto);
		
		
	}
	
	public void alterar(Produto produto) {
		//merger
		this.em.merge(produto);
		
	}
	public void remover(Produto produto) {
		produto= em.merge(produto);
		this.em.remove(produto);
		
		
	}
	public Produto buscarPorId(Long id) {
		
		
		return em.find(Produto.class, id);
		
			
	}
	public List<Produto>BuscarPorNome(String nome) {
		String jpql = "SELECT p FROM Produto p WHERE p.nome=:nome";
		return em.createQuery(jpql,Produto.class).setParameter("nome",nome).getResultList();
		
		
		
	}
	public List<Produto> buscarTodos(){
		 String jpql = "Select p FROM Produto p";
		 return em.createQuery(jpql,Produto.class).getResultList();
		
		
		
	}
    
      
   
}
