package ar.edu.unlam.embarcacion;

import java.util.HashSet;

public class Fondadero {

	private Integer cantidadMaxima;
	private HashSet<Yate> amarrados;

	public Fondadero(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
		this.amarrados = new HashSet<Yate>();
	}

	public Integer getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public boolean amararYate(Yate yate) throws NoHayLugar {
		if(amarrados.size()<this.cantidadMaxima) {
			amarrados.add(yate);
			return true;
		}else {
			throw new NoHayLugar("No hay espacio disponible");
		}
	}

	public void desamarrarYate(Yate vela) {
		amarrados.remove(vela);
		
	}

	public HashSet<Yate> getAmarrados() {
		return amarrados;
	}

	public void setAmarrados(HashSet<Yate> amarrados) {
		this.amarrados = amarrados;
	}

	public Integer cantidadYatesActuales() {
		// TODO Auto-generated method stub
		return amarrados.size();
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double total = 0.0;
		if(yate.getEslora()<=20) {
			 total = 2000.0;
		}else {
			total = 3000.0;
		}
		if(yate instanceof YateAVela) {
			return	total += 9000;
		}
		if(yate instanceof YateAMotor) {
			return	total += 10000;
		}
		return total;
	}

	public Double obtenerRecaudacionTotal() {
		Double recaudacionTotal = 0.0;
		for (Yate yate : amarrados) {
			if(yate.getEslora()<=20) {
				recaudacionTotal += 2000.0;
			}else {
				recaudacionTotal += 3000.0;
			}
			if(yate instanceof YateAVela) {
					recaudacionTotal += 9000;
			}
			if(yate instanceof YateAMotor) {
					recaudacionTotal += 10000;
			}
		}
		return recaudacionTotal;
		
	}
	
	

}
