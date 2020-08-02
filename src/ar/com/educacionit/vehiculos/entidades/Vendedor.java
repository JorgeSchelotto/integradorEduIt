package ar.com.educacionit.vehiculos.entidades;

public class Vendedor extends Persona {
	
	private int cantAutosVendidos; 
	

	public Vendedor(String nombre, String apellido, String numeroDocumento, int cantAutosVendidos) {
		super(nombre, apellido, numeroDocumento);
		this.cantAutosVendidos = cantAutosVendidos;
	}


	public int getCantAutosVendidos() {
		return cantAutosVendidos;
	}


	public void setCantAutosVendidos(int cantAutosVendidos) {
		this.cantAutosVendidos = cantAutosVendidos;
	}


	public String toString(){
		
		String stringFormatConcat = String.format("Nombre: %s, Apellido: %s, Dni: %s, Cantida de autos vendidos: %s",
				getNombre(), getApellido(), getNumeroDocumento(), cantAutosVendidos);

		return stringFormatConcat;
		
	}

}
