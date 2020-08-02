package ar.com.educacionit.vehiculos.entidades;

public class Auto extends Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	
	
	// Constructor
	public Auto(int alto, int ancho, int largo, String marca, String modelo, String color) {
		super(alto, ancho, largo);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	

	public String toString(){
		
		String stringFormatConcat = String.format("Marca: %s, Modelo: %s, Color: %s, Alto: %s, ancho: %s, Largo: %s",
				marca, modelo, color, getAlto(), getAncho(), getLargo());

		return stringFormatConcat;
		
	}
	
	


}
