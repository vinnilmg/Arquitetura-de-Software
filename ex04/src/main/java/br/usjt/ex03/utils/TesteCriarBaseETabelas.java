package br.usjt.ex03.utils;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {   
		
		Persistence.createEntityManagerFactory("usjtPU");  
	
	}
}