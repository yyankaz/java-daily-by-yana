package codewars.five_kyu;

//The Fibonacci numbers are the numbers in the following integer sequence
// (Fn): 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
// Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying:
//F(n)∗F(n+1)=prod
//
//Your function takes an integer (prod) and returns an array/tuple (check the function signature/sample
// tests for the return type in your language):
//Examples:
//
//714 ---> (21, 34, true)
//--> since F(8) = 21, F(9) = 34 and 714 = 21 * 34
//
//800 --->  (34, 55, false)
//--> since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55

public class ProdFib {
    public static long[] productFib(long prod) {
        long Fn = 0;
        long Fn1 = 1;
        long result = Fn * Fn1;
        while(result < prod) {
            long temp = Fn1;
            Fn1 = Fn + Fn1;
            Fn = temp;
            result = Fn * Fn1;
        }
        long boolVal = 0;
        if (result == prod){
            boolVal = 1;
        }
        return new long[]{Fn, Fn1, boolVal};
    }
}
