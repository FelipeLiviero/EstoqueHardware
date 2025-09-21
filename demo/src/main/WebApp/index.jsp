<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>EstoqueHardware</title>
</head>
<body>
<h1>Estoque</h1>
<form action="EstoqueHardware" method="post">
    <label for="codigo">Código:</label>
    <input type="text" name="codigo" id="codigo"><br>

    <label for="tipo_produto">Tipo de Produto:</label>
    <input type="text" name="tipo_produto" id="tipo_produto"><br>

    <label for="marca">Marca:</label>
    <input type="text" name="marca" id="marca"><br>

    <label for="memoria">Memória:</label>
    <input type="text" name="memoria" id="memoria"><br>

    <label for="quantidade">Quantidade:</label>
    <input type="text" name="quantidade" id="quantidade"><br>

    <label for="cadastrar">Cadastrar:</label>
    <input type="checkbox" name="cadastrar" id="cadastrar"><br>

    <label for="confirmar_acao">Confirmar Ação:</label>
    <input type="text" name="confirmar_acao" id="confirmar_acao"><br>

    <input type="submit" value="Enviar">
</form>
</body>
</html>