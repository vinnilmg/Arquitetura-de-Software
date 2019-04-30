package br.ustj.aula1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.ustj.aula1.Repository.CidadeRepository;
import br.ustj.aula1.model.Cidade;

public class CidadeTest {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Test
	public void testBuscaNomeAssincrono () throws InterruptedException,
													ExecutionException {
		Future <Cidade> futureCidade = cidadeRepository.findByNome("Franco da Rocha");
		System.out.println("Testando");
		
		Cidade cidade = futureCidade.get();
		System.out.println("Nome city: " + cidade.getNome());
	}
	
	@Test
	public void testeBuscaLatitudeLongitudeAssincrono () throws InterruptedException,
													ExecutionException {
		Future <Cidade> futureCidade = cidadeRepository.findByLatitudeAndLongitude(10, 15);
		System.out.println("Testando");
		
		Cidade cidade = futureCidade.get();
		System.out.println("Nome city: " + cidade.getNome() + "Longitude: " + cidade.getLongitude() + "Latitude: " + cidade.getLatitude());
		
	}
	
	@Test
	public void testBuscaNomeAssincronoIgnoreCase () throws InterruptedException,
													ExecutionException {
		String nomeMaiusculo = "Franco da Rocha";
		nomeMaiusculo.toUpperCase();
		System.out.println("To grande hehe" + nomeMaiusculo);
		
		String nomeCorreto = "Franco da Rocha";
		System.out.println("Correto aqui: " + nomeCorreto);
		
		if(nomeMaiusculo.equalsIgnoreCase(nomeCorreto)) {
			Future <Cidade> futureCidade = cidadeRepository.findByNome(nomeCorreto);
			System.out.println("Testando");
		
			Cidade cidade = futureCidade.get();
			System.out.println("Nome city: " + cidade.getNome());
		}
		else {
			System.out.println("Deu ruim!");
		}
	}
	
	
	@Test
	public void testeQuerieExplicitaPorNome()  throws InterruptedException,
														ExecutionException {
		Cidade cidade = cidadeRepository.buscarPeloNome("Franco da Rocha");
		System.out.println(cidade.getNome());
	}
	
	@Test
	public void testeQuerieExplicitaPorLatitudeELongitude()  throws InterruptedException,
														ExecutionException {
		Cidade cidade = cidadeRepository.buscarPorLatitudeELongitude(10, 15);
		System.out.println("Nome city: " + cidade.getNome() + "Longitude: " + cidade.getLongitude() + "Latitude: " + cidade.getLatitude());
	}
	
	@Test
	public void testeQuerieExplicitaPorNomeIgnoreCase()  throws InterruptedException,
														ExecutionException {
		String nomeMaiusculo = "Franco da Rocha";
		nomeMaiusculo.toUpperCase();
		System.out.println("To grande hehe" + nomeMaiusculo);
		
		String nomeCorreto = "Franco da Rocha";
		System.out.println("Correto aqui: " + nomeCorreto);
		
		if(nomeMaiusculo.equalsIgnoreCase(nomeCorreto)) {
			Cidade cidade = cidadeRepository.buscarPeloNome(nomeCorreto);
			System.out.println(cidade.getNome());
		}
		else {
			System.out.println("Deu ruim!");
		}
	}
	
	@Test
	public void testeNamedQueryPorNome() {
		Cidade cidade = cidadeRepository.buscarPorNomeNamedQuery("Franco da Rocha");
		System.out.println(cidade.getNome());
	}
	
	@Test
	public void testeNamedQueryPorLatitudeELongitude() {
		Cidade cidade = cidadeRepository.buscarPorLatitudeELongitudeNamedQuery(10, 15);
		System.out.println("Nome city: " + cidade.getNome() + "Longitude: " + cidade.getLongitude() + "Latitude: " + cidade.getLatitude());
	}
	
	@Test
	public void testeNamedQueryPorNomeIgnoreCase() {
	
		String nomeMaiusculo = "Franco da Rocha";
		nomeMaiusculo.toUpperCase();
		System.out.println("To grande hehe" + nomeMaiusculo);
		
		String nomeCorreto = "Franco da Rocha";
		System.out.println("Correto aqui: " + nomeCorreto);
		
		if(nomeMaiusculo.equalsIgnoreCase(nomeCorreto)) {
			Cidade cidade = cidadeRepository.buscarPorNomeNamedQuery(nomeCorreto);
			System.out.println(cidade.getNome());
		}
		else {
			System.out.println("Deu ruim!");
		}
	}
}
