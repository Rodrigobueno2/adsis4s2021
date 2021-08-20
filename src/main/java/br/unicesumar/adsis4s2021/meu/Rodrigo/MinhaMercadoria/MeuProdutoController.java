package br.unicesumar.adsis4s2021.meu.Rodrigo.MinhaMercadoria;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MeusProdutos")
public class MeuProdutoController {
    
	@Autowired
	private MeuProdutoPersistente repo;
	
	
	@GetMapping
	public List<MeuProduto> listarProdutos() {
	
		return repo.findAll();
	}
	
	@PostMapping
	public String salvarProdutos(@RequestBody MeuProduto novo) {
		novo = repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void apagarMeuProduto(@PathVariable ("id") String id) {
		 repo.deleteById(id);
		
	}
	
	@GetMapping("/{id}")
	public Optional<MeuProduto> listarProdutoPorId(@PathVariable("id") String id) {
        return repo.findById(id);
		
	}
	
	@PutMapping("/{id}")
	public void atualizarMeuProdutoPorId(@PathVariable("id") String id, @RequestBody MeuProduto novo) {
		repo.deleteById(id);
		repo.save(novo);
	}
	
}
