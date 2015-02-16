package dao;
import java.sql.*;
public class DataSource {
	
	private String cadenaConexion;
	private Connection conexion;
	
	public DataSource() throws ClassNotFoundException{
		this.cadenaConexion = "jdbc:mysql://localhost:3306/java_usuario";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conexion = DriverManager.getConnection(this.cadenaConexion,"daniel","12345");
		//	Statement s = this.conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet ejecutarConsulta(String sql){
		try {
			ResultSet dt = this.conexion.createStatement().executeQuery(sql);
			return dt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
}
