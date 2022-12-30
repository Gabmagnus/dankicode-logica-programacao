<?php 
// Gerar uma array com 5 numeros nao repetidos!




function random_non_repeat($start, $end, $quantity) {
for ($i = 0; $i < $quantity; $i++) {
    $numeros = [];

    while (true) {
        $numero = rand($start, $end);
       if (!in_array($numero, $numeros)) {
        array_push($numeros, $numero);
        break;      
       } else {
        $numero = rand($start, $end);
       }
    }
    return $numeros;
} 
}
print_r(random_non_repeat(1, 5, 5));
?>