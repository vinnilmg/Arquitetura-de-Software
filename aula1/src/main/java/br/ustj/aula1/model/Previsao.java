package br.ustj.aula1.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Previsao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name="cidade")
	private Cidade cidade;
	
	@OneToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="dia")
	private DiaDaSemana dia;
	private Double temp_min;
	private Double temp_max;
	private Double umidade;
	private String camp_text;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public DiaDaSemana getDia() {
		return dia;
	}
	public void setDia(DiaDaSemana dia) {
		this.dia = dia;
	}
	public Double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}
	public Double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}
	public Double getUmidade() {
		return umidade;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public String getCamp_text() {
		return camp_text;
	}
	public void setCamp_text(String camp_text) {
		this.camp_text = camp_text;
	}
}
