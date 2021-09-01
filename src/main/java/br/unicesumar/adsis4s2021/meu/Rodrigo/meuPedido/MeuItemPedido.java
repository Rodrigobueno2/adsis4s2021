package br.unicesumar.adsis4s2021.meu.Rodrigo.meuPedido;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.Rodrigo.produtoMeu.ProdutoMeu;

@Entity
public class MeuItemPedido {
    @Id
    private String id;
    //A classe BigDecimal trabalha com pontos flutuantes de precisão arbitrária,
    //ou seja, você consegue estipular qual o nivel de precisão você precisa trabalhar. 
    private BigDecimal precoUnitario;
    private BigDecimal percentualDeDesconto;
    private BigDecimal quantidade;
    
    @ManyToOne
    private ProdutoMeu produto;
    
    public MeuItemPedido() {
    	
    }
    
    public String getId() {
		return id;
	}
    
    public BigDecimal getPercentualDeDesconto() {
		return percentualDeDesconto;
	}
    
    public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
    
    public BigDecimal getQuantidade() {
		return quantidade;
	}
}
