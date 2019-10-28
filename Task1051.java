/* Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students not standing in the right positions.  
(This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1051{

    public static int heightChecker(int[] heights) {
        int[] secondArray = new int[heights.length];
        int counter = 0;
        for(int i = 0; i < heights.length; i++){
            secondArray[i] = heights[i];
        }
        Arrays.parallelSort(secondArray);
        for(int i = 0; i < heights.length; i++){
            if(secondArray[i] != heights[i]) counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,3,3,4,6};
        System.out.println(heightChecker(array));
        input.close();
    }
}