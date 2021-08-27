package br.unicesumar.adsis4s2021.meu.Rodrigo.produtoMeu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MeusProdutos2")
public class ProdutoMeuController {
   @Autowired
   private ProdutoMeuRepository repositorio;
   
   @GetMapping("/com-preco-maior-que")
   public List<ProdutoMeu> getComPrecoMaiorQue(@RequestParam float preco){
	   return repositorio.recuperarProdutoComPrecoMaior(preco);
   }
   
   @GetMapping
   public List<ProdutoMeu> getTudo(){
	  return repositorio.findAll();
   }
   
   @PostMapping
   public String post(@RequestBody ProdutoMeu novo) {
	   if(repositorio.findById(novo.getId()).isPresent()) {
		   throw new RuntimeException("Este produto já existe,");
	   }
	   novo = repositorio.save(novo);
	   return novo.getId();
   }
   
   @PutMapping("/{id}")
   public String put(@RequestBody ProdutoMeu novo, @PathVariable("id") String id) {
	   if(!novo.getId().equals(id)) {
		   throw new RuntimeException("Para atualizar, o id da url tem que ser o mesmo do produto que quer atualizar");
	   }
	   if(!repositorio.findById(id).isPresent()) {
		   throw new RuntimeException("Esse produto não existe, faça um post dele primeiro");
	   }
	   repositorio.deleteById(id);
	   novo = repositorio.save(novo);
	   return novo.getId();
   }
   
   @DeleteMapping("/{id}")
   public void deletepeloId(@PathVariable("id") String id) {
	  if(!repositorio.findById(id).isPresent()) {
		  throw new RuntimeException("Este produto não existe");
		  
	  }
	  repositorio.deleteById(id);
   }
   
   
   @GetMapping("/{id}")
   public ProdutoMeu BuscarProduto(@PathVariable("id") String id) {
	   if(!repositorio.findById(id).isPresent()) {
		   throw new RuntimeException("produto que desja procurar não existe");
		   
	   }
	   return repositorio.findById(id).get();
	   
   }
   

}
