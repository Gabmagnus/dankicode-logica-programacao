#include <stdio.h>
#include <stdlib.h>
#include <wchar.h>
#include <locale.h>

int main() {
    setlocale(LC_CTYPE, "");

    char nome[256];
    int ano;
    char vidade;

    printf("Qual seu nome?\n> ");
    scanf("%s", nome);

    printf("Em que ano voce nasceu?\n> ");
    scanf("%d", &ano);
    int idade = 2022 - ano;

    printf("Nome: %s\nIdade: %d", nome, idade);
    printf("\nAguarde enquanto validamos seus dados!\n");

    printf("A Primeira letra do seu nome e %c\n", nome[0]);

    if (idade <= 18 && idade >= 14) {
        printf("Voce e ADOLESCENTE", idade);
    } else if (idade < 14) {
        printf("Voce e CRIANÇA", idade);
    } else {
        printf("Voce e ADULTO", idade);
    }
    
    
    return 0;
}