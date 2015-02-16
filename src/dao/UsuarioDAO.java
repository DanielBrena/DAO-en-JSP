package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class UsuarioDAO implements IUsuario {

	@Override
	public Usuario login(String name, String contrasena) {
		
		
		try {
			DataSource ds = new DataSource();
			String sql = "SELECT * usuario WHERE usu_nombre = '" + name + "' AND usu_contrasena = '"+ contrasena + "'";
			ResultSet dt = ds.ejecutarConsulta(sql);
			Usuario usuario = null;
			if(!dt.next()){
				return usuario;
			}else{
				usuario.setId(dt.getObject("usu_id").toString());
				usuario.setNombre(dt.getObject("usu_nombre").toString());
				usuario.setContrasena(dt.getObject("usu_contrasena").toString());
				usuario.setStatus(dt.getObject("usu_status").toString());
				return usuario;
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
