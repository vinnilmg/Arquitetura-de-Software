package br.usjt.ex02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.usjt.ex02.model.Cidade;
import br.usjt.ex02.service.CidadeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CidadeTest {

	@Autowired
	@Qualifier("CidadeService")
	private CidadeService cidadeService;

	@Test
	public void testeBuscaLatitudeLongitude() {
		Cidade cidade = cidadeService.BuscaLatitudeLongitude(10.0, 15.0);
		System.out.println(cidade.getNome() + " " + cidade.getLatitude() + " " + cidade.getLongitude());
	}

//	@Test
//	public void testeBuscaNome() {
//		Cidade cidade = cidadeRepository.findByNome("Franco da Rocha");
//		System.out.println(cidade.getNome());
//	}
//
//	@Test
//	public void testeBuscaNomeIgnoreCase() {
//		String nome = "Franco da Rocha";
//		if (nome.equalsIgnoreCase("franco da rocha")) {
//			Cidade cidade = cidadeRepository.findByNome(nome);
//			System.out.println(cidade.getNome());
//		}
//	}
}
