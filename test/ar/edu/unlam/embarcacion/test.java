package ar.edu.unlam.embarcacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	private static final String expected  = null;
	@Test
	public void queSePuedaCrearFondadero() {
		Fondadero yarcht = new Fondadero(5);
		assertNotNull(yarcht);
	}
	@Test 
	public void queSePuedaAmarrarUnYateAMotor() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(5);
		Yate motor = new YateAMotor("AZ1","Andres borgeat",18.87,5.15,119.0,37,5500,5959,"2xmotores MAN RK2805",9000,23,6500);
		assertTrue(yarcht.amararYate(motor));
	}
	@Test 
	public void queSePuedaAmarrarUnYateAVela() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(5);
		Yate vela = new YateAVela("XXR","sebastian pardo"
				,6.90,2.7,13.45,5,1400,21.5,85.0,133.0);
		assertTrue(yarcht.amararYate(vela));
	}
	@Test
	public void queSePuedaDesamarrarUnYate() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(5);
		Yate vela = new YateAVela("XXR","sebastian pardo"
				,6.90,2.7,13.45,5,1400,21.5,85.0,133.0);
		yarcht.amararYate(vela);
		yarcht.desamarrarYate(vela);
		assertEquals(0,yarcht.getAmarrados().size());
		
	}
	@Test
	public void obtenerCantidadYatesAmarrados() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(5);
		yarcht.amararYate(new YateAVela("XXR","sebastian pardo"
				,6.90,2.7,13.45,5,1400,21.5,85.0,133.0));
		yarcht.amararYate(new YateAMotor("AZ1","Andres borgeat",18.87,5.15,119.0,37,5500,5959,"2xmotores MAN RK2805",9000,23,6500));
		
	assertEquals((Integer)2,yarcht.cantidadYatesActuales());
	}
	@Test
	public void queSePuedaObtenerElValorDeAlquilerMensual() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(5);
		Yate motor = new YateAMotor("AZ1","Andres borgeat",18.87,5.15,119.0,37,5500,5959,"2xmotores MAN RK2805",9000,23,6500);
		yarcht.amararYate(motor);
		
		
		assertEquals((Double)13000.0,yarcht.obtenerPrecioDeAmarre(motor));
	}
	@Test
	public void queSePuedaObtenerRecaudacionTotal() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(5);
		yarcht.amararYate(new YateAVela("XXR","sebastian pardo"
				,6.90,2.7,13.45,5,1400,21.5,85.0,133.0));
		yarcht.amararYate(new YateAMotor("AZ1","Andres borgeat",18.87,5.15,119.0,37,5500,5959,"2xmotores MAN RK2805",9000,23,6500));
		
		assertEquals((Double)24000.0,yarcht.obtenerRecaudacionTotal());
	}
	@Test(expected = NoHayLugar.class)
	public void queNoSePuedaAgregarMasVelasDeLoPermitido() throws NoHayLugar {
		Fondadero yarcht = new Fondadero(1);
		yarcht.amararYate(new YateAVela("XXR","sebastian pardo"
				,6.90,2.7,13.45,5,1400,21.5,85.0,133.0));
		yarcht.amararYate(new YateAMotor("AZ1","Andres borgeat",18.87,5.15,119.0,37,5500,5959,"2xmotores MAN RK2805",9000,23,6500));
	}
	
	
	

}
