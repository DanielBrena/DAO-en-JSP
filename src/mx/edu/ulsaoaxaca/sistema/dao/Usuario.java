package mx.edu.ulsaoaxaca.sistema.dao;

//Transfer Object
//Java bean
public class Usuario {
	private String nombre;
	private String correoElectronico;
	
	public Usuario(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
	
}
