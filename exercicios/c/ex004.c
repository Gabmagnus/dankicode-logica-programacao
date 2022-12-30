
#include <stdio.h>
#include <stdlib.h>

int main() {
    int i = 1;

    while(i <= 10) {
        printf("%d\n", i);

        if (i == 3) {
            int k = 5;
            while(k != 0) {
                printf("->%d\n", k);
                k--;
            }
        }
        i++;
    }
    return 0;
}