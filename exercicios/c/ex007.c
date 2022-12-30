#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int p_1 = 0;
    int p_2 = 0;
    char p1str[256] = "";
    char p2str[256] = "";



    while (p_1 != 1 && p_1 != 2 && p_1 != 3) {
        printf("\nJogador 1 Pedra[1], Papel[2], Tesoura[3]\n>> ");
        scanf("%d", &p_1);
        if (p_1 == 1) {
            strcpy(p1str, "PEDRA");
            printf("\nO Jogador 1 escolheu %s", p1str);
        } else if (p_1 == 2) {
            strcpy(p1str, "PAPEL");
            printf("\nO Jogador 1 escolheu %s", p1str);
        } else if (p_1 == 3) {
            strcpy(p1str, "TESOURA");
            printf("\nO Jogador 1 escolheu %s", p1str);
        } else {
            printf("Jogada invalida!\n");
        }
    }

    while (p_2 != 1 && p_2 != 2 && p_2 != 3) {
        
        printf("\n\n\nJogador 2 Pedra[1], Papel[2], Tesoura[3]\n>> ");
        scanf("%d", &p_2);

        if (p_2 == 1) {
            strcpy(p2str, "PEDRA");
            printf("\nO Jogador 1 escolheu %s", p2str);
        } else if (p_2 == 2) {
            strcpy(p2str, "PAPEL");
            printf("\nO Jogador 1 escolheu %s", p2str);
        } else if (p_2 == 3) {
            strcpy(p2str, "TESOURA");
            printf("\nO Jogador 1 escolheu %s", p2str);
        } else {
            printf("Jogada invalida!\n");
        }
   
    }

    printf("\nJogador 1 escolheu %s\n", p1str);
    printf("\nJogador 2 escolheu %s\n", p2str);
    if (p_1 == 1) { //jog 1 pedra
        if (p_2 == 1) {
            printf("\nEMPATE!");
        } else if (p_2 == 2) {
            printf("Jogador 2 venceu!");
        } else {
            printf("Jogador 1 venceu!");
        }
    } else if (p_1 == 2) {//jog 1 papel
        if (p_2 == 1) {
            printf("Jogador 1 venceu!");
        } else if (p_2 == 2) {
            printf("\nEMPATE!");
        } else {
            printf("Jogador 2 venceu!");
        }
    } else if (p_1 == 3) {//jog 1 tesoura
        if (p_2 == 1) {
            printf("Jogador 2 venceu!");
        } else if (p_2 == 2) {
            printf("Jogador 1 venceu!");
        } else {
            printf("\nEMPATE!");
        }
    return 0;
}
}