<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Adicionando Contato</title>
</head>
<body>
	<form action="adicionaContato">
		<label>
			Nome:
			<input type="text" name="nome" id="nome"/>
		</label><br />
		<label>
			Email:
			<input type="text" name="email" id="email"/>
		</label><br />
		<label>
			Endereço:
			<input type="text" name="endereco" id="endereco"/>
		</label><br />
		<label>
			Data Nascimento:
			<input type="text" name="dataNascimento" id="dataNascimento"/>
		</label><br />
		
		<input type="submit" value="Gravar" id="gravar"/>
	</form>
</body>
</html>