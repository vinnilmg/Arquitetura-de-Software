package br.usjt.ex01.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tempo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String diaSemana;
	private double tempMinima;
	private double tempMaxima;
	private double humidade;
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public double getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public double getTempMaxima() {
		return tempMaxima;
	}
	public void setTempMaxima(double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public double getHumidade() {
		return humidade;
	}
	public void setHumidade(double humidade) {
		this.humidade = humidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
