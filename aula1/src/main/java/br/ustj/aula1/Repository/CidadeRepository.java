package br.ustj.aula1.Repository;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import br.ustj.aula1.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Long>{

	
//	//aula 5
////	public Cidade findByNome (String nome);
////	public Cidade findByLatitudeAndLongitude(int latitude, int longitude);
//	
//	
//	//aula 6 ex1 
//	@Async
//	public Future< Cidade > findByNome(String nome);
//			
//	@Async
//	public Future <Cidade> findByLatitudeAndLongitude(int latitude, int longitude);
//	
//	public default String ignoreCase(String nome) {
//		nome.equalsIgnoreCase(nome);
//		return nome;	
//	}
//	
//   //ex2
//	
//	@Query("SELECT a from Cidade a where a.nome = :nome")
//	public Cidade findByNomeEx(@Param ("nome") String nome);
//	
//	@Query("SELECT a from Cidade a where a.latitude = :latitude and a.longitude = :longitude")
//	public Cidade findByLatitudeAndLongitudeEx(@Param ("latitude")int latitude, 
//			@Param ("longitude") int longitude);
//
//	//ex3
//	public Cidade buscarPeloNome(@Param("nome") String nome);
//	
//	public Cidade buscarPorLatitudeELongitude(@Param("latitude") int latitude,
//			@Param ("longitude") int longitude );
	
	
	//AULA 05 EXERCICIOS
//	
//	public Cidade findByNome(String nome);
//	
//	public Cidade findByLatitudeAndLongitude(int latitude, int longitude);
	
	//AULA 06 EXERCICIOS
	//01
	@Async
	public Future <Cidade> findByNome(String nome);
	
	@Async
	public Future <Cidade> findByLatitudeAndLongitude(int latitude, int longitude);
	
	//02
	@Query("SELECT c FROM tb_cidades c WHERE c.nome = :nome")
	public Cidade buscarPeloNome(@Param ("nome") String nome);
	
	@Query("SELECT c FROM tb_cidades c WHERE c.latitude = :latitude and c.longitude = :longitude")
	public Cidade buscarPorLatitudeELongitude(@Param ("latitude") int latitude, @Param ("longitude") int longitude);
	
	//ex03
	
	public Cidade buscarPorNomeNamedQuery(@Param ("nome") String nome);
	
	public Cidade buscarPorLatitudeELongitudeNamedQuery(@Param ("latitude") int latitude, @Param ("longitude") int longitude);
	
}
