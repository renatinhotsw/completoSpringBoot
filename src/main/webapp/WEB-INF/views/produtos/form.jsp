<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de produtos</title>
</head>
<body>
	<form method="post" action="/casadocodigo/produtos">
		<div>
			<label for="titulo">Titulo</label> <input type="text" name="titulo"
				id="titulo" />
		</div>
		<div>
			<label for="descricao">Descri��o</label>
			<textarea rows="10" cols="20" name="descricao" id="descricao">
			</textarea>
		</div>
		<div>
			<label for="nropaginas">N�mero de paginas</label> <input type="text"
				name="nropaginas" id="nropaginas" />
		</div>
		<div>
			<input type="submit" value="Enviar">
		</div>
	</form>
</body>
</html>