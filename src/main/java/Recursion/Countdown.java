package Recursion;

public class Countdown {
    public static void countdown(int i) {
        System.out.println(i);

        //base case
        if (i <= 0) {
            return;
        } else{
            countdown(i-1); //recursion case
        }
    }
}
