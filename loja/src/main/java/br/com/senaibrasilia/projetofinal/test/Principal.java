package br.com.senaibrasilia.projetofinal.test;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.senaibrasilia.projetofinal.dao.CategoriaDAO;
import br.com.senaibrasilia.projetofinal.dao.ClienteDAO;
import br.com.senaibrasilia.projetofinal.dao.ProdutoDAO;
import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Cliente;
import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1= new Produto("Mouse","Mouse Deel Optico",new BigDecimal("100"));
		Cliente c= new Cliente("André","rua A Brasília",2349879L,87676897654L);
		
		Categoria cat= new Categoria("Informática","Material de informática");
		//EntityManager -Roberto Carlos JPA
		EntityManager em = JPAUtil.getEntityManager();// conexão
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO catDao = new CategoriaDAO(em);
		ClienteDAO clientDao = new ClienteDAO(em);
		Produto p = produtoDao.buscarPorId(1l);
		
		System.out.println(p1.getPreco());
         
	     p1.setNome("Keyboard");
	     //imprimindo todos
		
	   //entra n estado da gaiola  gerenciado
			produtoDao.cadastrar(p1);
			catDao.cadastrar(cat);
			clientDao.cadastrar(c);
		// O CARA É agora o objeto "em"
		//Configura com persistence.xml -ligação com o persistence-unit
		    
	        //abre a transação
		em.getTransaction().begin();
		//salva no banco
		em.getTransaction().commit();
		//fecha
		em.close();
		
		
		
		
		
		
		
		
			
	}

}
