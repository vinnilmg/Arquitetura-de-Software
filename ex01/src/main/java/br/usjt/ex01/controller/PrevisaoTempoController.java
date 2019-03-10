package br.usjt.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ex01.model.Tempo;
import br.usjt.ex01.repository.TempoRepository;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private TempoRepository tempoRepo;
	
	@GetMapping("/tempo")
	public ModelAndView listarTempo () {
		
		ModelAndView mv = new ModelAndView("lista_tempo");
		
		mv.addObject(new Tempo());
		
		List <Tempo> tempo = tempoRepo.findAll();
		
		mv.addObject("tempo", tempo);
		
		return mv;

}
}
