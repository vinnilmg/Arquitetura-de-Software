package br.ustj.aula1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ustj.aula1.model.Previsao;
import br.ustj.aula1.service.PrevisaoService;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisaoService previsaoService;

	@GetMapping("/previsao")
	public ModelAndView ListarPrevisao() {

		ModelAndView mv = new ModelAndView("lista_previsao");

		mv.addObject(new Previsao());

		List<Previsao> previsoes = previsaoService.listarTodos();
		if (!previsoes.isEmpty()) {
			mv.addObject("previsoes", previsoes);
		}

		return mv;
	}

	@PostMapping
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsao";
	}
}
