package mx.edu.ulsaoaxaca.sistema.dao;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO  {
	Usuario selectUsuario(String nombre);
	List<Usuario> selectAll();
	
}
