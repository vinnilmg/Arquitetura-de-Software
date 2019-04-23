package br.usjt.ex05.CidadeTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.usjt.ex05.model.Cidade;
import br.usjt.ex05.service.CidadeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CidadeTest {

	@Autowired
	@Qualifier("CidadeService")
	private CidadeService cidadeService;

//	
//	//Ex01
//	@Test
//	public void testeBuscaLatitudeLongitude() {
//		Cidade cidade = cidadeService.BuscaLatitudeLongitude(10.0, 15.0);
//		System.out.println(cidade.getNome() + " " + cidade.getLatitude() + " " + cidade.getLongitude());
//	}
//
//	//Ex01
//	@Test
//	public void testeBuscaNome() {
//		Cidade cidade = cidadeService.BuscarNome("Franco da Rocha");
//		System.out.println(cidade.getNome());
//	}
//
//	
//	//Ex01
//	@Test
//	public void testeBuscaNomeIgnoreCase() {
//		String nome = "FRANCO DA ROCHA";
////		if (nome.equalsIgnoreCase("franco da rocha")) {
//			Cidade cidade = cidadeService.BuscarNome("Franco da rocha");
////			System.out.println(cidade.getNome());
//			if (nome.equalsIgnoreCase(cidade.getNome())) {
//				System.out.println(cidade.getNome());
//		}
//	}
//	
	
	
}
