package ex002;

import java.util.Scanner;



/* verificaçoes: 2s para digitar o nome, mais de 10 caracteres*/
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        try {
            double tempo_antigo = System.currentTimeMillis();
            
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            while (true) {
                System.out.println("V Digite um nome V");
                String nome = scanner.nextLine();

                if (utils.convertTime(System.currentTimeMillis() - tempo_antigo) >= 2) {
                    if (nome.length() >= 10) {
                        System.out.println("\n\n\n\n NOME FORNECIDO COM SUCESSO \n\n\n\n");
                        break;
                    } else {
                        System.out.println("O nome fornecido deve ter mais de 10 caracteres!");
                        tempo_antigo = System.currentTimeMillis();
                    }
                } else {
                    System.out.println("Muito rapido, deve esperar mais de 2 segundos para digitar!");
                    tempo_antigo = System.currentTimeMillis();
                }
            }
        } finally {
            scanner.close();
        }
    }



    public void letraA() {
        Utils utils = new Utils();
        try (Scanner scanner = new Scanner(System.in)) {
            double tempo_antigo = System.currentTimeMillis();

            System.out.println("Digite a letra a o mais rapido possivel!");
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("a")) {
                double dif = utils.convertTime(System.currentTimeMillis() - tempo_antigo  );
                System.out.println("Parabéns, você levou " + dif + "s apara digitar!" );
            } else {
                System.out.println("LETRA A BURRO!");
            }
        }
    }

}
