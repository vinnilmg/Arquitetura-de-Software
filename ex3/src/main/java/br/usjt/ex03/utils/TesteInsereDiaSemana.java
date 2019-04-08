package br.usjt.ex03.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ex02.model.DiaSemana;

public class TesteInsereDiaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaSemana dia = new DiaSemana();
		dia.setDiaSemana("Quinta");
//		dia.setDiaSemana("Terça");
//		dia.setDiaSemana("Quarta");
//		dia.setDiaSemana("Quinta");
//		dia.setDiaSemana("Sexta");
//		dia.setDiaSemana("Sabado");
//		dia.setDiaSemana("Domingo");

		System.out.println(dia);

		manager.persist(dia);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}