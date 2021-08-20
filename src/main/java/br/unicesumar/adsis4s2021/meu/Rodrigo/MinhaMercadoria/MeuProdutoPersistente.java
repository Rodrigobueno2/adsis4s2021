package br.unicesumar.adsis4s2021.meu.Rodrigo.MinhaMercadoria;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeuProdutoPersistente extends JpaRepository<MeuProduto, String> {

}
