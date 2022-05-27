package br.com.senaibrasilia.projetofinal.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	
	
		 private Long id;
		 private String nome ;
		 private String descricao;
				 
		 public Categoria () {
			 
			 
		 }
		 public Categoria(String nome) {
				super();
				this.nome = nome;
				
							}
		public Categoria(String nome, String descricao) {
			super();
			this.nome = nome;
			this.descricao = descricao;
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		
		
		
	
	
}
