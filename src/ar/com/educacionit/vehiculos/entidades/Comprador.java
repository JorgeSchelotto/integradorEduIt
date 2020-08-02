package ar.com.educacionit.vehiculos.entidades;

public class Comprador extends Persona {
	
	
	private double presupuesto;
	
	public double getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}


	public Comprador(String nombre, String apellido, String numeroDocumento, double presupuesto) {
		super(nombre, apellido, numeroDocumento);
		this.presupuesto = presupuesto;
	}

	
	public String toString(){
		
		String stringFormatConcat = String.format("Nombre: %s, Apellido: %s, Dni: %s, Presupuesto: %s",
				getNombre(), getApellido(), getNumeroDocumento(), presupuesto);

		return stringFormatConcat;
		
	}

}
