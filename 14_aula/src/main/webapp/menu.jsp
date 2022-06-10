<%@page import = "dao.UsuarioDAO" %>
<%@page import = "modelo.Usuario" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<%String nome = (String) session.getAttribute("usuarioSession");%>

	<h2>Bem vindo ao menu,<%=nome%></h2>

	<div>
		<h2>Lista de Cadastrados</h2>
	</div>
	<div>
		<table border=1>
		<tr>
		<th>ID</th>
		<th>NOME</th>
		<th>USUARIO</th>
		<th colspan=2></th>
		</tr>
		<%
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista = dao.listar();
		
		for(Usuario usuario: lista){
			out.print("<tr>");
				out.print("<td>");
			 
				out.print(usuario.getId());
			
				out.print("</td>");
			
			
				out.print("<td>");
			 
				out.print(usuario.getNome());
			
				out.print("</td>");
			
		
				out.print("<td>");
			 
				out.print(usuario.getUsuario());
				
				out.print("</td>");
				out.print("</tr>");
				
			 
			 
			 
		}
		%>
	</table>
	<div>
		<nav>
			<ul>
				<li><a href="index.html">Logout</a></li>
			</ul>
		</nav>
	</div>
	</div>

</body>
</html>