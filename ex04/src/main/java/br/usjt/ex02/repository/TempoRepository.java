package br.usjt.ex02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.ex02.model.Tempo;

@Repository
public interface TempoRepository extends JpaRepository <Tempo, Long>{
	

	
	

}
