package mx.edu.ulsaoaxaca.sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataSource {
	private String usuario = "daniel";
	private String contrasena = "12345";
	private String esquema = "java_usuario";
	private String ip = "localhost";
	private String puerto = "3306";
	private String protocolo;
	private String controlador = "com.mysql.jdbc.Driver";
	private Connection conexion;
	
	public DataSource(){
		this.protocolo = "jdbc:mysql://" + this.ip + ":" + this.puerto + "/" + this.esquema;
		
		try {
			//1 Registrar el driver
			Class.forName(this.controlador).newInstance();
			//2 Realizamos la conexion
			this.conexion = DriverManager.getConnection(this.protocolo,this.usuario,this.contrasena);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	//2.1
	public ResultSet ejecutarConsulta(String consulta){
		Statement s = null;
		ResultSet r = null;
		try {
			//3 Ejecutamos la consulta
			s = this.conexion.createStatement();
			r = s.executeQuery(consulta);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	//5.3
	public int ejecutarActualizacion(String consulta){
		return 0;
	}
}
