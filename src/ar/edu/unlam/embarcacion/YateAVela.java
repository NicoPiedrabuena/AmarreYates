package ar.edu.unlam.embarcacion;

public class YateAVela extends Yate {

	private Double alturaMastil;
	private Double superficieVelicaMayor;
	private Double superficieTotal;

	public YateAVela(String nombre, String dueño, Double manga, Double calado, Double eslora,
			Integer tripulacion, Integer peso, Double alturaMastil, Double superficieVelicaMayor ,Double superficieTotal) {
		super(nombre,dueño,manga,calado,eslora,tripulacion,peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor= superficieVelicaMayor;
		this.superficieTotal=superficieTotal; 
	}

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public Double getSuperficieVelicaMayor() {
		return superficieVelicaMayor;
	}

	public void setSuperficieVelicaMayor(Double superficieVelicaMayor) {
		this.superficieVelicaMayor = superficieVelicaMayor;
	}

	public Double getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}
	


	

}
