#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int p_1 = 0;
    int pc;
    char p1str[256] = "";
    char pcstr[256] = "";


    srand ( time(NULL) );
    pc = (rand() % 3) + 1;  
    if (pc == 1) {
        strcpy(pcstr, "PEDRA");
    } else if (pc == 2) {
        strcpy(pcstr, "PAPEL");
    } else if (pc == 3) {
        strcpy(pcstr, "TESOURA");
    }

    while (p_1 != 1 && p_1 != 2 && p_1 != 3) {
        printf("\nJogador > Pedra[1], Papel[2], Tesoura[3]\n>> ");
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

    printf("\n\n\n\n\nO Jogador escolheu %s", p1str);
    printf("\nO PC Escolheu %s\n\n", pcstr);
    if (p_1 == 1) { //jog 1 pedra
        if (pc == 1) {
            printf("\nEMPATE!");
        } else if (pc == 2) {
            printf("PC venceu!");
        } else {
            printf("Jogador venceu!");
        }
    } else if (p_1 == 2) {//jog 1 papel
        if (pc == 1) {
            printf("Jogador venceu!");
        } else if (pc == 2) {
            printf("\nEMPATE!");
        } else {
            printf("PC venceu!");
        }
    } else if (p_1 == 3) {//jog 1 tesoura
        if (pc == 1) {
            printf("PC venceu!");
        } else if (pc == 2) {
            printf("Jogador venceu!");
        } else {
            printf("\nEMPATE!");
        }
    return 0;
}
}