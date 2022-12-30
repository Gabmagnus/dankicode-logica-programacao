package ex001;


public class Main {

    public char[] letras = {'G', 'a', 'b', 'r', 'i', 'e', 'l'};
    public int[] numeros = {10, 20, 30};

    public int soma() {
        int soma_completa = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma_completa += numeros[i];
        }


        return soma_completa;
    }
    public String nome() {
        String nomeCompleto = "";

        for (int i = 0; i < letras.length; i++) {
            nomeCompleto+=letras[i];
        }

        return nomeCompleto;
    }
    

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.soma());
    }
    

    
    
}
