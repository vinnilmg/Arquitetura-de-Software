package br.usjt.ex02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ex02.model.Tempo;
import br.usjt.ex02.service.TempoService;

@Controller
public class PrevisaoTempoController {

	// @Autowired
	// private TempoRepository tempoRepo;

	@Autowired
	private TempoService tempoService;

	@GetMapping("/tempo")
	public ModelAndView listarTempo() {

		ModelAndView mv = new ModelAndView("lista_tempo");

		mv.addObject(new Tempo());

		List<Tempo> tempo = tempoService.listarTodos();

		mv.addObject("tempo", tempo);

		return mv;
	}

	@PostMapping("/tempo")
	public String salvar(Tempo tempo) {
		tempoService.salvar(tempo);
		return "redirect:/tempo";
	}

}
