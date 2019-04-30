package br.ustj.aula1.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.ustj.aula1.model.Cidade;
import br.ustj.aula1.model.DiaDaSemana;
import br.ustj.aula1.model.Previsao;

public class InserePrevisaoCidadeEDia {
		public static void main(String args[]) {
	EntityManager manager = JPAUtil.getEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	transaction.begin();
	DiaDaSemana dia = new DiaDaSemana();
	dia.setDia("Domingo");
	Cidade cidade = new Cidade();
	cidade.setNome("São Paulo");
	cidade.setLongitude(1234);
	cidade.setLatitude(4321);
	Previsao prev = new Previsao();
	prev.setDia(dia);
	prev.setCidade(cidade);
	prev.setTemp_min(10.0);
	prev.setTemp_max(12.0);
	prev.setUmidade(50.0);
	prev.setCamp_text("Dia Nublado");
	manager.persist(prev);
	transaction.commit();
	manager.close();
	JPAUtil.close();
	
	
		}
}
