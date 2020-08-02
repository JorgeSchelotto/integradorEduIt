package ar.com.educacionit.vehiculos.entidades;

public abstract class Vehiculo {
	private int alto;
	private int ancho;
	private int largo;
	
	
	
	
	
	public Vehiculo(int alto, int ancho, int largo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int getLargo() {
		return largo;
	}
	
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	
	

}
