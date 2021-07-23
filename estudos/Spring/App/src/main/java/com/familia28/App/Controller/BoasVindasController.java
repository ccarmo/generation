package com.familia28.App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BoasVindas")
public class BoasVindasController {
    
	@GetMapping("/rota1")
	public String rota1() {
		return "Utilizei da persistência, atenção ao detalhe e a da orientação ao futuro";
	}
	
	@GetMapping("/rota2")
	public String rota2() {
		return "Gostaria de me aprofundar mais nos estudos de Spring";
	}
}
