package ar.com.educacionit.vehiculos.entidades;

public abstract class Persona {
	
	
	private String nombre;
	private String apellido;
	private String numeroDocumento;
	
	
	
	
	
	public Persona(String nombre, String apellido, String numeroDocumento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDocumento = numeroDocumento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	
	
	
	

}
