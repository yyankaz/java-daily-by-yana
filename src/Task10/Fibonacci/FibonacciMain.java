package Task10.Fibonacci;

public class FibonacciMain {


    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0, curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

}
