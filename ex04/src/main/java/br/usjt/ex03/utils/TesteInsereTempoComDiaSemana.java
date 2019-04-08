//package br.usjt.ex03.utils;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//
//import br.usjt.ex02.model.DiaSemana;
//import br.usjt.ex02.model.Tempo;
//
//public class TesteInsereTempoComDiaSemana {
//	public static void main(String[] args) {
//		EntityManager manager = JPAUtil.getEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		transaction.begin();
//		
//		DiaSemana dia = new DiaSemana();
//		dia.setDiaSemana("Terça");
//		manager.persist(dia);
//		
//		Tempo tempo = new Tempo();
//		tempo.setTempMinima(20.0);
//		tempo.setTempMaxima(30.0);
//		tempo.setHumidade(15.0);
//		tempo.setDescricao("Opa");
//		tempo.setDataHora("01/03/2019 00:00");
//		tempo.setLatitude(10);
//		tempo.setLongitude(15);
//		tempo.setDiaSemana(dia);
//		
//	System.out.println(tempo +"" + dia);
//
//		manager.persist(tempo);
//		transaction.commit();
//		System.out.println(tempo);
//		manager.close();
//		JPAUtil.close();
//	}
//
//}
