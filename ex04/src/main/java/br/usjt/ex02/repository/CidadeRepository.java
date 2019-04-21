package br.usjt.ex02.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.ex02.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade, Long>{

	public Cidade findByLatitudeAndLongitude (double latitude, double longitude);
	
	public Cidade findByNome (String cidade);
}
