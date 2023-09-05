package com.generation.LojasGame.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name="tb_produto")

public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message="O nome do produto não pode ser nulo")
	@Size(min=5,max=35,message="o nome deve conter entre 5 e 35 caracteres")
	private String nome;
	
	@NotBlank(message="Descrição vazia não permitida")
	@Size(min=12,max=100,message=" descrição deve conter entre 12 e 100 caracteres")
	private String descricao;
	
	@NotBlank(message=" valor não pode ser vazio ")
	@Column(precision=8, scale=2)
	private BigDecimal preco;
	
	@NotBlank(message="Foto obrigatória")
	private String foto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
