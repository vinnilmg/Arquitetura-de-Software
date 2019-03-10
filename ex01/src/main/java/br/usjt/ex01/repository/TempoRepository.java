package br.usjt.ex01.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ex01.model.Tempo;


public interface TempoRepository extends JpaRepository <Tempo, Long>{

}
