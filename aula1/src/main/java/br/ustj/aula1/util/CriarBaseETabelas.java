package br.ustj.aula1.util;

import javax.persistence.Persistence;

public class CriarBaseETabelas {
	public static void main(String [] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}

}
