<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dankicode - Lógica</title>
    <style>
        html {
            background: darkgray;

        }
    </style>
</head>
<body>

<?php
$hello_world = ['H', '-', 'e', '-', 'l', '-', 'l', '-', 'o', '-', 'W', 'O', 'R', 'L', 'D'];
$string = "";
for ($i = 0; $i < count($hello_world); $i++) {
    if ($hello_world[$i] == '-') {
        $string.="<br>";
        continue;
    }
    $string.=$hello_world[$i];
}
echo $string;

?>

</body>
</html>

