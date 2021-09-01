package br.unicesumar.adsis4s2021.meu.Rodrigo.meuPedido;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MeuPedido {
	@Id
	private String id;
	private Long numero;
	private Date emitidoEm;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_pedido")
	private List<MeuItemPedido> itens;
	
	public MeuPedido() {
		
	}
	
	public Date getEmitidoEm() {
		return emitidoEm;
	}
	
	public String getId() {
		return id;
	}
	
	public List<MeuItemPedido> getItens() {
		return itens;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	
}
