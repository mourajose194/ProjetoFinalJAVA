package br.com.senaibrasilia.projetofinal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

//cLASSE DE MAPEAMENTO
//cLASSE DE eNTIDADE

//CREATE TABLE PRODUTO
@Entity 
@Table(name="produtos")

public class Produto {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();
	
	@ManyToOne
	private Categoria categoria;
	
	public Produto() {
			
		
	}
	public Produto(String nome, String descricao, BigDecimal preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
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
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public LocalDate getDataCadastro() {
        return dataCadastro;
    }
 
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
