<form method="POST">
    <label for="n1">Adcionar primeiro numero: </label>
    <input type="number" name="n1" id="n1"><br>

    <label for="n2">Adcionar segundo numero: </label>
    <input type="number" name="n2" id="n2">
</form>

<?php
$array_0 = array("jhones", "jamal", "gabriel",1 ,2 ,3);
$array_1 = array("gabriel", "jamal", "rogério", 2);
$array_3 = [];
$fresult = "";

for ($i = 0; $i < count($array_0); $i++) {
    for ($j = 0; $j < count($array_1); $j++) {
        if ($array_0[$i] == $array_1[$j]) {
            array_push($array_3, $array_0[$i]);
        }
    }
}


for ($k = 0; $k < count($array_3); $k++) {
    $fresult.=$array_3[$k].=" ";
}

print_r($array_3 );
echo "<br>";
echo $fresult;
?>