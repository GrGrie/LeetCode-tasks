/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory. */
import java.util.Scanner;
public class Task26{
    
    public static int removeDuplicates(int[] nums){
        int sameNumsCount = 1;
        int index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
                sameNumsCount++;
            }
        }
        return sameNumsCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
        System.out.println(removeDuplicates(array));
        input.close();
    }
}