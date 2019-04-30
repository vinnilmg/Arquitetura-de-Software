package br.ustj.aula1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ustj.aula1.Repository.PrevisaoRepository;
import br.ustj.aula1.model.Previsao;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	public void salvar( Previsao previsao) {
		previsaoRepo.save(previsao);
	}
	
	public List <Previsao> listarTodos(){
		return previsaoRepo.findAll();
	}
	
}
