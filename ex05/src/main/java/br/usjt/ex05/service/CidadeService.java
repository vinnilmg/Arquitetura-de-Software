package br.usjt.ex05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.usjt.ex05.model.Cidade;
import br.usjt.ex05.repository.CidadeRepository;

@Transactional
@Service("CidadeService")
public class CidadeService {

	@Autowired
	private CidadeRepository cityRepository;

	public Cidade BuscaLatitudeLongitude(double latitude, double longitude) {
		Cidade cidade = cityRepository.findByLatitudeAndLongitude(latitude, longitude);
		return cidade;
	}

	public Cidade BuscarNome(String nome) {
		Cidade cidade = cityRepository.findByNome(nome);
		return cidade;
	}
}
