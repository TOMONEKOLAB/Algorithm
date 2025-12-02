#include <stdio.h>

void swap(int *a, int *b) {
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

int main(int argc, char const *argv[]) {
    // Temporary variable & pointer swap example
    int a = 5;
    int b = 10;
    puts("Using temporary variable swap:");
    printf("Before swap: a = %d, b = %d\n", a, b);
    swap(&a, &b);
    printf("After  swap: a = %d, b = %d\n", a, b);
    puts("========================");

    // XOR swap example
    int x = 15;
    int y = 25;
    puts("Using XOR swap:");
    printf("Before XOR swap: x = %d, y = %d\n", x, y);
    x = x ^ y;  // x ^= y;
    y = x ^ y;  // y ^= x;
    x = x ^ y;  // x ^= y;
    // x ^= y ^= x ^= y;
    printf("After  XOR swap: x = %d, y = %d\n", x, y);
    puts("========================");

    // Addition and subtraction swap example
    int m = 30;
    int n = 45;
    puts("Using addition and subtraction swap:");
    printf("Before add/sub swap: m = %d, n = %d\n", m, n);
    n = m - n;
    m = m - n;  // m -= n;
    n = n + m;  // n += m;
    // n += m -= n = m - n;
    printf("After  add/sub swap: m = %d, n = %d\n", m, n);
    puts("========================");
    return 0;
}
