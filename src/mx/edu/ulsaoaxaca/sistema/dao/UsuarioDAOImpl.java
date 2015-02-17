package mx.edu.ulsaoaxaca.sistema.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{

	@Override
	public Usuario selectUsuario(String nombre){
		Usuario usuario = null;
		DataSource ds = new DataSource();
		ResultSet rs = ds.ejecutarConsulta("SELECT  * FROM usuario WHERE nombre = '" + nombre + "'");
		
		//while(rs.next()){
			usuario.setNombre("anie");
	//	}
		return usuario;

	}

	@Override
	public List<Usuario> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
