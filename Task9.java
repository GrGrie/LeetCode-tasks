/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.*/
import java.util.Scanner;
public class Task9{
    
    public static boolean isPalindrome(int x){
        char[] inputedNum = Integer.toString(x).toCharArray();
        char[] reversedNum = new char[inputedNum.length];
        for(int i = 0; i < inputedNum.length; i++)
            reversedNum[reversedNum.length - 1 - i] = inputedNum[i];
        if(Integer.toString(x).equals(String.copyValueOf(reversedNum))) return true;
        else return false;
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println(isPalindrome(input.nextInt()));
        input.close();
    }
}