package day.one;

public class Factorial {
    /*
      Find out the factorial of the given number 5 with be 1*2*3*4*5 = 120
     */

    public static void main(String[] args) {
        int fact = 6;
        int t = 1;

        for (int i = 1; i <= fact; i++) {
            t = t * i;
        }
        System.out.println(t);
    }

}
