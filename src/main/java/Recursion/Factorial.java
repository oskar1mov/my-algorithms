package Recursion;

public class Factorial {
    public static int factorial(int n) {
        if(n == 1) { //base case
            return 1;
        } else {
            return n * factorial(n - 1); //recursion case
        }
    }
}
