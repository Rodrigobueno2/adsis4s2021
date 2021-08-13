package br.unicesumar.adsis4s2021.meu.Rodrigo.mercadoria;

public class Mercadoria {
   private int id;
   private String descricao;
   private double  preco;
   
   public Mercadoria(int id, String descricao, double preco) {
	   this.id= id;
	   this.descricao = descricao;
	   this.preco = preco;
   }

public int getId() {
	return id;
}

public String getDescricao() {
	return descricao;
}

public double getPreco() {
	return preco;
}
   
   
}
