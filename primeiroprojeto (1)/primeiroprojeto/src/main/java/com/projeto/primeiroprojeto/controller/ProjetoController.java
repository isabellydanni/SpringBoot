package com.projeto.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Projeto")
public class ProjetoController {

	@GetMapping
	public String Projeto() {
		return "Projeto doação de sangue! \n Foi um evento onde pessoas que participaram de uma época da minha vida se encontravam para fazer um bem maior e que eu pude contribuir e ajudar as pessoas, há vários hospitais com os estoques de sangue baixíssimos e sempre que podemos ajudar outras pessoas, tentamos pois não sabemos o dia de amanhã, então trazemos estes eventos para os bairros, tiramos dúvidas e amenizamos os pré-conceitos com a colaboração do banco de sangue da cidade. \n Eu gosto muito de poder ajudar as pessoas e desde pequena tento contribuir, seja fazendo parte de eventos como este doando sangue ou fazendo trabalho voluntário. \n\n Acredito que tudo o que é compartilhado pode ser comemorado em conjunto ou trazer ajuda de outras pessoas e muitos aprendizados!!.";
	}
}
