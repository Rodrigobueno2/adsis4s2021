package br.unicesumar.adsis4s2021.meu.Rodrigo.mercadoria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
@RestController
@RequestMapping("/mercadorias")
public class MecadoriaController {
	List<Mercadoria> mercadorias = new ArrayList<>();

	public MecadoriaController() {
		mercadorias.add(new Mercadoria(1, "Macarrao abc", 20.00));
		mercadorias.add(new Mercadoria(2, "cerveja sdf", 10.00));
		mercadorias.add(new Mercadoria(3, "Arroz tijolo", 12.90));
	}

	@GetMapping
	public List<Mercadoria> getMercadorias() {
		return mercadorias;
	}
    
	//,
	@GetMapping("/{id}")
	public Mercadoria mercadoria(@PathVariable("id") int id) {
		for(Mercadoria m : mercadorias) {
			if(m.getId() == id) {
				return m;
			}
		}
		
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteMercadoria(@PathVariable("id") int id) {
		Mercadoria mercadoriaExcluir = null;
		for(Mercadoria m:mercadorias) {
			if(m.getId() == id) {
				mercadoriaExcluir = m;
				break;
			}
		}
		
		if(mercadoriaExcluir != null) {
			mercadorias.remove(mercadoriaExcluir);
		}
		
	}
	
	@PostMapping
	public void adicionarMercadorias(@RequestBody Mercadoria nova) {
		mercadorias.add(nova);
		
	}
	
	
	@PutMapping("/{id}")
	public void atualizarMercadoria(@RequestBody Mercadoria nova, @PathVariable("id") int id) {
		Mercadoria atualizar = null;
		for(Mercadoria m:mercadorias) {
			if(m.getId() == id) {
				atualizar = m;
				break;
			}
		}
		
		if(atualizar != null) {
			mercadorias.remove(atualizar);
			mercadorias.add(nova);
		}
	}
	
}
