package ar.edu.unlam.embarcacion;

import java.util.Objects;

public class Yate {

	private String nombre;
	private String dueño;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Integer peso;

	public Yate(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso) {
		this.nombre = nombre;
		this.dueño = dueño;
		this.manga= manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public Double getManga() {
		return manga;
	}

	public void setManga(Double manga) {
		this.manga = manga;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEslora() {
		return eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	

}
