package br.com.senaibrasilia.projetofinal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//create table clientes
@Entity
@Table(name="clientes")
public class Cliente {
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
	 private Long id;
     private String nome,endereco;
     private Long cpf,telefone;
     
     
 
     public Cliente () {
    	 
    	 
     }
	public Cliente(String nome, String endereco ,Long telefone, Long cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
     
         
}
