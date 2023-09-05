package com.generation.LojasGame.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@NotBlank(message="Por favor, digite uma descrição, ela não pode ser vazia")
		@Size(min=4,max=20,message="o nome deve conter entre 5 e 20 caracteres")
		private String nome;
		
		@NotBlank(message="Descrição não pode ser nula")
		@Size(min=5,max=100,message="A descrição deve conter entre 5 e 100 caracteres")
		private String descricao;

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
		
		

	}
