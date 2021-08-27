package br.unicesumar.adsis4s2021.meu.Rodrigo.produtoMeu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProdutoMeu {
    private String nome;
    private float  preco;
    @Id
    private String id;
    private String marca;
    
    public ProdutoMeu() {
    	
    }
    
    public ProdutoMeu(String id, String nome, float preco, String marca) {
    	this.id = id;
    	this.nome = nome;
    	this.marca = marca;
    	this.preco = preco;
    }
    
	public String getNome() {
		return nome;
	}
	public float getPreco() {
		return preco;
	}
	public String getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
    
    
    
    
}
