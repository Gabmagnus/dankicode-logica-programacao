
#include <stdio.h>
#include <stdlib.h>

int main() {
    char nome[256]; // [caracteres]
    char sobrenome[256]; // [caracteres]
    int ano_nascimento;
    int idade;

    printf("Qual seu nome?\n");
    scanf("%s", nome);
    
    printf("Olá, %s, qual seu sobrenome?\n");
    scanf("%s", sobrenome);
    
    printf("Ok %s %s, Vamos prosseguir, qual seu ano de nascimento?\n", nome, sobrenome);
    scanf("%d", &ano_nascimento);
    idade = 2022 - ano_nascimento;
    printf("Obrigado, %s %s, agora sei que você tem %d anos de idade!\n", nome, sobrenome, idade);

    return 0;
}