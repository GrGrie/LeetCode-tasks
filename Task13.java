/*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
*/
import java.util.Scanner;
public class Task13{
    public static int romanToInt(String s){
        int summ = 0;
        if(s.contains("IV")) summ -= 2;
        if(s.contains("IX")) summ -= 2;
        if(s.contains("XL")) summ -= 20;
        if(s.contains("XC")) summ -= 20;
        if(s.contains("CD")) summ -= 200;
        if(s.contains("CM")) summ -= 200;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I') summ++;
            else if(s.charAt(i) == 'V') summ += 5;
            else if(s.charAt(i) == 'X') summ += 10;
            else if(s.charAt(i) == 'L') summ += 50;
            else if(s.charAt(i) == 'C') summ += 100;
            else if(s.charAt(i) == 'D') summ += 500;
            else if(s.charAt(i) == 'M') summ += 1000;
        }
        return summ;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(romanToInt(input.nextLine()));
        input.close();
    }
}