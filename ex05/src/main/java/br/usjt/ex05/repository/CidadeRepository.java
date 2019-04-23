package br.usjt.ex05.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.ex05.model.Cidade;

@Repository("CidadeRepository")
public interface CidadeRepository extends JpaRepository <Cidade, Long>{

	public Cidade findByLatitudeAndLongitude (int latitude, int longitude);
	
	public Cidade findByNome (String cidade);
}
