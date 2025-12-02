# Swap

値の交換操作です．  
簡単に解説を．  
コードに関しては[`swap.c`](./swap.c)を参照してください．

## Temporary variable & pointer swap

```C
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
}
```

1つ目のブロックです．  
おそらくたいていの人がこれ使うんじゃないですかね．  
ポインタを活用しながら一時的な変数`tmp`を使って値を移し替える操作です．  
雑なポインタのイメージとしては，`&`がついている変数が近くにある変数のありかを指しているというイメージでしょうか．  
一方で`*`がついている変数が教えられた変数を指しているというイメージでしょうか．  
なので，`main()`で変数の`a`と`b`の変数のありかである`&a`と`&b`を渡して，使用される`swap()`でそのありかをもとに値を移し替えているイメージですかね．

## XOR swap

```C
int main(int argc, char const *argv[]) {
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
}
```
2つ目のブロックです．  
`XOR`操作を使って値を移し替える操作です．  
排他的論理和の性質である以下2つを利用しています．

$$
(x \oplus y) \oplus z = x \oplus(y \oplus z)　
a \oplus a = 0
$$

真理値表にでもまとめると分かりやすいと思います．  
というわけで真理値表は以下です．

|x|y|z|$x \oplus y$|$(x \oplus y) \oplus z$|$y \oplus z$|$x \oplus(y \oplus z)$|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|0|0|0|0|0|0|0|
|0|0|1|1|1|1|1|
|0|1|0|1|1|0|0|
|0|1|1|0|0|1|1|
|1|0|0|1|1|0|0|
|1|0|1|0|0|1|1|
|1|1|0|0|0|1|1|
|1|1|1|1|1|1|1|

3~6行目の`x`と`y`がそれぞれ入れ替わってることが分かるかと思います．  
要は，`x`が`1`ならば`y`が`0`になっており，`y`が`1`ならば`x`が`0`になっていることが分かると思います．  
ちなみに，無理矢理一行で書くとコメントアウトされている通りになります．  
`C`言語の仕様には触れませんのでここはご自身で．

## Addition and subtraction swap

```C
int main(int argc, char const *argv[]) {
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
}
```

3つ目のブロックです．  
`+`と`-`を使って値を移し替える操作です．  
ここに関しては実際に値を計算して出すのがいいんじゃないでしょうか．  
`XOR`の時同様，一行で書くとコメントアウトされている通りになります．

## 備考

プログラミング言語によっては書き方が変わります．  
言語使用の違いにより動作が変わるからですね．  
実際`Python`だと以下のように書けたりします．

```python
a = 10
b = 20
print("a = %d, b = %d" % (a, b))
a, b = b, a
print("a = %d, b = %d" % (a, b))
```

また，実数かつ $b \neq 0$ である前提ですが，以下のような書き方もできます．

```C
int main(int argc, char const *argv[]) {
    // Addition and subtraction swap example
    double a = 30;
    double b = 45;
    puts("Using addition and subtraction swap:");
    printf("Before add/sub swap: m = %d, n = %d\n", a, b);
    b = a / b;
    a = a / b;  //a /= b;
    b = b * a;  // b *= a;
    // b *= a /= b = a / b;
    printf("After  add/sub swap: m = %d, n = %d\n", a, b);
    puts("========================");
}
```

[README.mdへ](../README.md)
