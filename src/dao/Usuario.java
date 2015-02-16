package dao;

public class Usuario {
	private String id;
	private String nombre;
	private String contrasena;
	private String status;
	
	public Usuario(){
		
	}
	
	public Usuario(String id, String nombre, String contrasena, String status) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
