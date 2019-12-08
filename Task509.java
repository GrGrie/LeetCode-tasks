/* 
    Find n-th Fibonacci number.
*/
import java.util.Scanner;
class Task509 {
    public static int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        else return fib(N-1) + fib(N-2);
    }

    public static void main(String argc[]){
        Scanner input = new Scanner(System.in);
        System.out.println(fib(input.nextInt()));
        input.close();
    }
}