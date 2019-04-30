package br.ustj.aula1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ustj.aula1.model.Previsao;


public interface PrevisaoRepository extends JpaRepository<Previsao,Long>{
	
}
