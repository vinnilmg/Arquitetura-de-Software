package br.usjt.ex02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ex02.model.Tempo;
import br.usjt.ex02.repository.TempoRepository;

@Service
public class TempoService {

	@Autowired
	private TempoRepository tempoRepo;
	
	public void salvar(Tempo tempo) {
		tempoRepo.save(tempo);
	}
	
	public List <Tempo> listarTodos () {
		return tempoRepo.findAll();
		
	}
}
