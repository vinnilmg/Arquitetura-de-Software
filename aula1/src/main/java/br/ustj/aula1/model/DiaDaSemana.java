package br.ustj.aula1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_dia_semana")
public class DiaDaSemana {
	@Id
	@GeneratedValue
	private Long id;
	private String dia;
	@OneToOne (mappedBy= "dia")
	private Previsao previsao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	
}
