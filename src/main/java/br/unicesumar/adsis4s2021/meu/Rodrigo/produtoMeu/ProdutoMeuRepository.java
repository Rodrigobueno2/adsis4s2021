package br.unicesumar.adsis4s2021.meu.Rodrigo.produtoMeu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoMeuRepository extends JpaRepository<ProdutoMeu, String>{
   @Query("select p from ProdutoMeu p where p.preco >= :preco")
   List<ProdutoMeu> recuperarProdutoComPrecoMaior(float preco);
   
   @Query(value = "select p.nome, p.id, p.marca, p.preco from produtoMeu p where p.preco >= :preco", nativeQuery = true)
   List<ProdutoMeu> recuperarProdutoComPrecoMaiorComSQL(float preco);
}
