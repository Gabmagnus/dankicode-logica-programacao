package poo003;

import java.util.HashMap;
import java.util.Map;

public class Utils003 {

    public void contaNotas(int qtdnotas) {
        int vlr = qtdnotas;
        int[] notas = new int[]{50,20,10,1};
        int i = 0;
        Map<Integer, Integer> qtdNotas = new HashMap<Integer, Integer>();
        
        while(vlr != 0){
            if(vlr >= notas[i]) {
             int resto = vlr % notas[i];
             qtdNotas.put(notas[i], vlr / notas[i]);
             vlr = resto;
                if(resto > 0){
                    i++;
                }
            } else {
                i++;
            }
        }
        
        for (Integer key : qtdNotas.keySet()) {
            System.out.println("Nota de " + key + " reais: " + qtdNotas.get(key));
        }
    }
}
