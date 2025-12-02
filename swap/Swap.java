class IntWrapper {
    public int value;
    public IntWrapper(int v) { value = v; }
}

public class Swap {
    static void swap(IntWrapper a, IntWrapper b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }

    public static void main(String[] args) {
        // Temporary variable & pointer swap example
        IntWrapper a = new IntWrapper(5);
        IntWrapper b = new IntWrapper(10);

        System.out.println("Using temporary variable swap:");
        System.out.println("Before swap: a = " + a.value + ", b = " + b.value);
        swap(a, b);
        System.out.println("After  swap: a = " + a.value + ", b = " + b.value);
        System.out.println("========================");

        // XOR swap example
        int x = 15, y = 25;
        System.out.println("Using XOR swap:");
        System.out.println("Before XOR swap: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After  XOR swap: x = " + x + ", y = " + y);
        System.out.println("========================");

        // Addition and subtraction swap
        int m = 30, n = 45;
        System.out.println("Using addition and subtraction swap:");
        System.out.println("Before add/sub swap: m = " + m + ", n = " + n);
        n = m - n;
        m = m - n;
        n = n + m;
        System.out.println("After  add/sub swap: m = " + m + ", n = " + n);
        System.out.println("========================");
    }
}
