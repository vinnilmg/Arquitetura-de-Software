package br.usjt.ex02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.usjt.ex02.model.Cidade;
import br.usjt.ex02.repository.CidadeRepository;

@Transactional
@Service("CidadeService")
public class CidadeService {

	
	@Autowired
	private CidadeRepository cityRepository;
	
	public Cidade BuscaLatitudeLongitude(double latitude, double longitude) {
			Cidade cidade = cityRepository.findByLatitudeAndLongitude(latitude, longitude);
			return cidade;
	}
	
	
}
