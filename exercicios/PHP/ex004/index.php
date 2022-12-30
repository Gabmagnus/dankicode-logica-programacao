

 <?php
$names = array('Guilherme', 'Joao', 'Lucas', 'Guilherme', 'Matheus', 'Gustavo', 'Lucas', 'Gustavo', 'Gustavo');
$in_common_names = array();

for ($i = 0; $i < count($names); $i++) {
    $actual_name = $names[$i];
    if (!isset($in_common_names[$actual_name])) { 
        $in_common_names[$actual_name] = 1;   
    } else {
        $in_common_names[$actual_name]++;
    }
}


echo "Encontrando nomes repetidos...";
echo "<br>";

foreach ($in_common_names as $nome => $value) {
    if ($value > 1) {
        printf("Encontrado! O nome %s foi encontrado %d vezes.<br>", $nome, $value);
    }
}



 ?>