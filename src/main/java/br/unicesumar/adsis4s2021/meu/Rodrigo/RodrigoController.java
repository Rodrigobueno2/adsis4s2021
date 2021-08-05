package br.unicesumar.adsis4s2021.meu.Rodrigo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rodrigo-controller")
public class RodrigoController {
	
   @GetMapping
   public String get() {
	   return "Olá, o Rodrigo controller está funcionando!";
	   
   }
}
