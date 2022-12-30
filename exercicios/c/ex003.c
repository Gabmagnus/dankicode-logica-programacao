/* 
inicio

    declarar variaveis horario_filme, horario_atual;
    
    se horario_atual (menor que) horario_filme

        ainda temos que aguardar

    senao se horario_atual (maior) horario_filme + 30

        foi excedido o limite de tempo, nao poderá entrar na seção!
    
    senao se horario atual (igual) horario_filme
        
        podemos entrar! bem no horário

    senao 

        podemos entrar!

fim
*/


#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int horario_filme = 20;
    int horario_atual = 60;

    //posso entrar no cinema?

    if (horario_atual < horario_filme) {
        printf("Ainda temos que aguardar! ");
    } else if (horario_atual > horario_filme + 30 ) {
        printf("foi excedido o limite de tempo, nao poderá entrar na seção!");            
    } else if (horario_atual == horario_filme) {
        printf("podemos entrar! bem no horário");
    } else {
        printf("podemos entrar!");
    }

    return 0;
}