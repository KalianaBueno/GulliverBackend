package com.gulliver.model;

public class Hoteis {

	private String nome;
	private String endereco;
	private double valorDiaria;
	private int classificacao;
	
	
	
	
	public Hoteis() {
		super();
	}


	public Hoteis(String nome, String endereco, double valorDiaria, int classificacao) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.valorDiaria = valorDiaria;
		this.classificacao = classificacao;
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


	public double getValorDiaria() {
		return valorDiaria;
	}


	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}


	public int getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	
	
	
}
