package br.ustj.aula1.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_cidades")

@NamedQuery (name = "Cidade.buscarPorNomeNamedQuery",
			 query = "SELECT c FROM tb_cidades c WHERE c.nome = :nome")

@NamedQuery (name = "Cidade.buscarPorLatitudeELongitudeNamedQuery",
			 query = "SELECT c FROM tb_cidades c WHERE c.latitude = :latitude and c.longitude = :longitude")

public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int latitude;
	private int longitude;
	
	@OneToMany(mappedBy = "cidade",cascade = CascadeType.ALL )
	private List<Previsao> previsoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public List<Previsao> getPrevisoes() {
		return previsoes;
	}

	public void setPrevisoes(List<Previsao> previsoes) {
		this.previsoes = previsoes;
	}

	public List<Previsao> getPrevisao() {
		return previsoes;
	}

	public void setConsumos(List<Previsao> previsoes) {
		this.previsoes = previsoes;
	}	
	
	
}
