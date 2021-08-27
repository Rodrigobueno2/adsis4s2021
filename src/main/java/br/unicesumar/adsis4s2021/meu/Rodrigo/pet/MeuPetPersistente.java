package br.unicesumar.adsis4s2021.meu.Rodrigo.pet;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeuPetPersistente extends JpaRepository<MeuPet, String> {

}
