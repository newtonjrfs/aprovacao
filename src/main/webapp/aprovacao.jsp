<html>
<head>
<title>Aprovação</title>
</head>


<body background="http://1.bp.blogspot.com/-6DD0Y_hQboY/Ub48iS6lA4I/AAAAAAAAC28/z8NkrW2Zrjs/s1600/light_azul_png_by_florluceroeditions-d428f5l.png">

	<h1 align="center">Sistema de Aprovação</h1>
	
	<h2 align="center">
	<form>
	
		<p>  Nome:   <input type="text" name="nome" value="${param.nome}"><br> </p>
		<p>Frequencia: <input type="text" name="frequencia" value="${param.frequencia}"><br> </p>
		<p>Nota Final:  <input type="text" name="nota" value="${param.nota}"><br> </p>
		
	
		<button>Resultado</button>
		
	</form>
	</h2>
    <b>${resultadoNota}</b>
</body>
</html>
