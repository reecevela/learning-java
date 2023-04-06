public class Factorial {
    int n;

    public static int factorial(int n) {
        if (n === 0 || n === 1) {
            return 1;
        } else {
            return n * factorial(n)
        }
    }
}

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + Factorial.factorial(5))
    }
}