package entities;

import enums.CategoriaProduto;

public class Produto {
	
	private Integer idProduto;
	private String nome;
	private Double preço;
	private Integer quantidade;
	private CategoriaProduto categoria;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nome, Double preço, Integer quantidade, CategoriaProduto categoria) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}
		
}
