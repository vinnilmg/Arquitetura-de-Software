package br.usjt.ex03.utils;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ex02.model.Cidade;
import br.usjt.ex02.model.Tempo;

public class TesteInsereDuasPrevisoesUmaCidade {

	public static void main(String[] args) {

		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		Cidade cidade = new Cidade();

		cidade.setNome("Franco da Rocha");
		cidade.setLatitude(20.0);
		cidade.setLongitude(25.0);

		List<Tempo> prevTempos = new ArrayList<>();

		Tempo previsaoTempo1 = new Tempo();
		previsaoTempo1.setTempMinima(20.0);
		previsaoTempo1.setTempMaxima(30.0);
		previsaoTempo1.setHumidade(15.0);
		previsaoTempo1.setDescricao("Opa");
		previsaoTempo1.setDataHora("01/03/2019 00:00");
		previsaoTempo1.setLatitude(10);
		previsaoTempo1.setLongitude(15);
		previsaoTempo1.setCidade(cidade);

		Tempo previsaoTempo2 = new Tempo();
		previsaoTempo2.setTempMinima(10.0);
		previsaoTempo2.setTempMaxima(40.0);
		previsaoTempo2.setHumidade(25.0);
		previsaoTempo2.setDescricao("Opa");
		previsaoTempo2.setDataHora("03/03/2019 00:00");
		previsaoTempo2.setLatitude(10);
		previsaoTempo2.setLongitude(15);
		previsaoTempo2.setCidade(cidade);

		prevTempos.add(previsaoTempo1);
		prevTempos.add(previsaoTempo2);

		cidade.setTempos(prevTempos);
		manager.persist(previsaoTempo1);
		manager.persist(previsaoTempo2);

		manager.persist(cidade);

		transaction.commit();
		manager.close();
		JPAUtil.close();

	}
}
