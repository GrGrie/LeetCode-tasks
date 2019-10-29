/*Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.*/ 
import java.util.Scanner;
public class Task922{
    
    public static int[] sortArrayByParityII(int[] A){
        int[] odd = new int[A.length / 2]; int oddCounter = 0;
        int[] even = new int[A.length / 2]; int evenCounter = 0;
        System.out.println(A.length);
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                even[evenCounter] = A[i];
                evenCounter++;
            } else {
                odd[oddCounter] = A[i];
                oddCounter++;
            }
        }
        oddCounter = 0; evenCounter = 0;
        for(int i = 0; i < A.length; i++){
            if(i % 2 == 0) A[i] = even[++evenCounter];
            else A[i] = odd[++oddCounter];
        }
        return A;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i : arr){
            arr[i] = input.nextInt();
        }   
            System.out.println(sortArrayByParityII(arr));
        input.close();
    }
}