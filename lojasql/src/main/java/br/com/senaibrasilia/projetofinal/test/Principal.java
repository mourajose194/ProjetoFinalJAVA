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
		
		Cliente c= new Cliente("André","rua A Brasília",2349879L,87676897654L);
		Categoria cat= new Categoria("Informática","Material de informática");
		Categoria cat1= new Categoria("Eletrodomésticos","Material de casa");
		//coloca o produto na categoria
		Produto p1= new Produto("Mouse","Mouse Deel ",new BigDecimal("100"),cat);
		p1.getDataCadastro().atStartOfDay();
		Produto p3= new Produto("KeyBoard","Teclado  ",new BigDecimal("65.7"),cat1);
		p1.getDataCadastro().atStartOfDay();
		Produto p2= new Produto("Geladeira","Consul ",new BigDecimal("1000"),cat1);
		p2.getDataCadastro().atStartOfDay();
		//EntityManager -Roberto Carlos JPA
		EntityManager em = JPAUtil.getEntityManager();// conexão
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO catDao = new CategoriaDAO(em);
		ClienteDAO clientDao = new ClienteDAO(em);
		
		//Produto p = produtoDao.buscarPorId(1l);
		
		System.out.println(p1.getPreco());
		produtoDao.buscarPorId(1l);
		
		
		
		// O CARA É agora o objeto "em"
		//Configura com persistence.xml -ligação com o persistence-unit
		    
	        
		em.getTransaction().begin();
		//entra n estado da gaiola  gerenciado
			
		catDao.cadastrar(cat);
		catDao.cadastrar(cat1);
		produtoDao.cadastrar(p1);	
		produtoDao.cadastrar(p2);
		produtoDao.cadastrar(p3);
		clientDao.cadastrar(c);
		
		//salva no banco
		em.getTransaction().commit();
		//fecha
		em.close();
		
		
		
		
		
		
		
		
			
	}

}
