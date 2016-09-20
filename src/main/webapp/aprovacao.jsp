<html>
<head>
<title>Aprovação</title>
</head>


<body background="http://mlb-d2-p.mlstatic.com/papel-de-parede-bobinex-listras-azul-branco-lavavel-471201-MLB20282059373_042015-F.jpg?square=false">
	<br><br> 
	<h1 align="center"> <font face = "Comic Sans MS" size = "8">Sistema de Aprovação</font></h1>
	

	<table align="center">
	

	<form>
	
		<tr>
			<td>
				<p> 
				<font size = "5">Nome:   <input type="text" name="nome" value="${param.nome}"></font><br> <br>
				</p>
			</td>
		</tr>
		
		<tr>
			<td>
				<p> 
				<font size = "5"> Frequencia: <input type="text" name="frequencia" value="${param.frequencia}"></font><br><br>
				</p>
			</td>
		</tr>
		
		<tr>
			<td>
				<p>  
				<font size = "5"> Nota Final: <input type="text" name="nota" value="${param.nota}"></font><br><br> 
				</p>
			</td>
		</tr>
			
		
		<tr>
			<td>
				<button>
				<font size = "3">Resultado</font>
				</button>
			</td>
		</tr>
		<br><br> 
		<tr>
			<td><br><br>
				<font size = "5"><b>${resultadoNota}</b>
				</font>
			</td>
		</tr>
		
	</form>

	
	</table>
	
</body>
</html>
