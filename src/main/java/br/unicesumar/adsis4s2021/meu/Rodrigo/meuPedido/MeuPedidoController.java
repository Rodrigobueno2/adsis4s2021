package br.unicesumar.adsis4s2021.meu.Rodrigo.meuPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MeusPedidos")
public class MeuPedidoController {
    @Autowired // o spring boot instancia sozinho
    private MeuPedidoRepository repo;
	
}
