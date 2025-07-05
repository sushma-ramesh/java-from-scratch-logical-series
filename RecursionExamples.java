public class RecursionExamples {

    // Factorial using recursion: n! = n × (n-1)!
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci using recursion: f(n) = f(n-1) + f(n-2)
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of digits using recursion
    public static int sumOfDigits(int num) {
        if (num == 0) return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        // Test factorial
        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact); // 120

        // Test fibonacci
        int fib = fibonacci(5);
        System.out.println("Fibonacci of 5: " + fib); // 5 (0, 1, 1, 2, 3, 5)

        // Test sum of digits
        int sum = sumOfDigits(1234);
        System.out.println("Sum of digits (1234): " + sum); // 10
    }
}
