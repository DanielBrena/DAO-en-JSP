package mx.edu.ulsaoaxaca.sistema.dao;

import java.sql.SQLException;

public class TestUsuarioDAO {
	public static void main(String[] args){
		//1
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		//2
		Usuario usuario = usuarioDAO.selectUsuario("daniel");
		//System.out.println(usuario.getNombre());
		Usuario u = new  Usuario();
		u.setNombre("a");
		System.out.println(u.getNombre());
	}
}
