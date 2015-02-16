<%@ page import= "dao.*"%>

<%

String usu = request.getParameter("usuario");
String cont = request.getParameter("contrasena");

UsuarioDAO usuario = new UsuarioDAO();
Usuario u = usuario.login(usu, cont);
out.println(u);
if(u != null){
	out.println("Bienvenido");
	out.println(u.getNombre());
}else{
	out.println("EL usuario no existe en la base de datos");
	out.println("<a href='index.jsp'>Regresar</a>");
}


//UsuarioDAO	usuario = new UsuarioDAO().login(request.getPatameter("usuario"), request.getPatameter("contrasena"));



%>