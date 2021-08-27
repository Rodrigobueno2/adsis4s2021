package br.unicesumar.adsis4s2021.meu.Rodrigo.pet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MeuPet {
	@Id
    private String codigoPet;
    private String nome;
    private String raca;
    
    
    public MeuPet() {
    	
    }
    
    public MeuPet(String codigoPet, String nome, String raca) {
    	this.codigoPet = codigoPet;
    	this.nome = nome;
    	this.raca = raca;
    }

	public String getcodigoPet() {
		return codigoPet;
	}

	public String getNome() {
		return nome;
	}

	public String getraca() {
		return raca;
	}
    
    
    
}
