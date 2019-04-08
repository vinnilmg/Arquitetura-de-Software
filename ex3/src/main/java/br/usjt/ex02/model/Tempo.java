package br.usjt.ex02.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="tb_tempo")
public class Tempo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=5)
	private double tempMinima;
	private double tempMaxima;
	private double humidade;
	private String descricao;
	private String dataHora;
	private double latitude;
	private double longitude;
	
	
	@OneToOne(optional=false)
	@JoinColumn(name="id_dia_semana")
	private DiaSemana diaSemana;
	
	
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(humidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tempMaxima);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tempMinima);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tempo other = (Tempo) obj;
		if (dataHora == null) {
			if (other.dataHora != null)
				return false;
		} else if (!dataHora.equals(other.dataHora))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (Double.doubleToLongBits(humidade) != Double.doubleToLongBits(other.humidade))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		if (Double.doubleToLongBits(tempMaxima) != Double.doubleToLongBits(other.tempMaxima))
			return false;
		if (Double.doubleToLongBits(tempMinima) != Double.doubleToLongBits(other.tempMinima))
			return false;
		return true;
	}
	
	
	

}
