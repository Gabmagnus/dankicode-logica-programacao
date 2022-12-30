package ex003;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        startGame();
    }

    
    public static void startGame() {

        try (Scanner resposta = new Scanner(System.in)) {
            int p = 0;
            String resposta_jogador = "";
            // String wrong_answ_end = "Você errou :(\nJogo encerrado\nVocê fez " + p + " pontos.\n"; 
            // String correct_answ = "Você acertou!\nVocê está com " + p + " pontos.\n";
            // String user_exit = "O jogo foi finalizado por escolha do jogador!\nVocê pontou: " + p + " Pontos!";
            
            System.out.println("Bem vindo ao jogo de perguntas e respostas!\n");
            if (continueCheck()) {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Vamos continuar!\n> Qual a capital do brasil?");
                resposta_jogador = resposta.nextLine();
                if (resposta_jogador.equalsIgnoreCase("Brasilia")) {
                    p++;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Você acertou!\nVocê está com " + p + " pontos.\n");

                    if (continueCheck()) {
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.println("Vamos continuar!\n> Em qual continente fica o brasil?");
                        resposta_jogador = resposta.nextLine();

                        if (resposta_jogador.equalsIgnoreCase("America do sul")) {
                            p = p + 1;
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            System.out.println("Você acertou!\nVocê está com " + p + " pontos.\n");

                            if (continueCheck()) {
                                System.out.print("\033[H\033[2J");  
                                System.out.flush();
                                System.out.println("Vamos continuar!\n> Em que time joga cristiano ronaldo?");
                                resposta_jogador = resposta.nextLine();
        
                                if (resposta_jogador.equalsIgnoreCase("gremio")) {
                                    p = p + 1;
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush();
                                    System.out.println("Você acertou TODAS as perguntas!\nObrigado por jogar!\nTotal de pontos: " + p);
                                } else {
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush();
                                    System.out.println("Você errou :(\nJogo encerrado\nVocê fez " + p + " pontos.\n");
                                }
                        } else {
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            System.out.println("O jogo foi finalizado por escolha do jogador!\nVocê pontou: " + p + " Pontos!");
                        }
                    } else {
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.println("Você errou :(\nJogo encerrado\nVocê fez " + p + " pontos.\n");
                    }
                } else {
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("O jogo foi finalizado por escolha do jogador!\nVocê pontou: " + p + " Pontos!");
                }
            } else {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Você errou :(\nJogo encerrado\nVocê fez " + p + " pontos.\n");
            }
        }        
    }
    }

    
    public static boolean continueCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite [ S ] para continuar!");
        String s = scanner.nextLine();
        if (s.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }
}
