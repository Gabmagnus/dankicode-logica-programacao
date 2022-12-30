<form method="post">
    <label for="nome">NOME : </label>
    <input type="text" name="nome" id="nome"><br><br>
    <label for="numero">Numero : </label>
    <input type="text" name="numero" id="numero"><br><br>
    <label for="email]">email : </label>
    <input type="text" name="email" id="email"><br><br>
    <input type="submit" name="enviandomentiras" value="enviandomentiras">
</form>


<?php
// mais de 5 caracteres
// são numeros
// se possui @
//Isset = verificar se existe
// @ - suprimir mensagem de erro!

if (isset($_POST['enviandomentiras'])) {
    $nome = $_POST['nome'];
    $numero = $_POST['numero'];
    $email = $_POST['email'];

    if (strlen($nome) > 5) {
        echo "Nome enviado com sucesso!";
    }

    echo "<br>";
    if (is_numeric($numero)) {
        echo "Numero enviado com sucesso!";
    }


    echo "<br>";
    if (strpos($email, "@")) {
        echo "email enviado com sucesso!";
    }
}

?>