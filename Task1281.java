/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.*/
import java.util.Scanner;
public class Task1281{
    
        public static int subtractProductAndSum(int n) {
            String numberString = Integer.toString(n);
            int sum = 0, product = 1, tmp;
            for(int i = 0; i < numberString.length(); i++){
                tmp = numberString.charAt(i) - 48;
                sum += tmp;
                product *= tmp;
            }
            return product - sum;
        }
    

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(subtractProductAndSum(input.nextInt()));
        input.close();
    }
}