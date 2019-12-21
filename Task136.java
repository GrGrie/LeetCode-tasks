import java.util.HashSet;
// 136. Single Number
/* Given a non-empty array of integers, every element appears twice except for one. Find that single one. */

public class Task136{
    
    
    public static int singleNumber(int[] nums) {
        
        HashSet<Integer> s = new HashSet<Integer>();
	    for (int i: nums){
	    	if(!s.add(i)){
	    		s.remove(i);
	    	}
        }
	    return s.iterator().next();
        
    }
    
    public static void main(String[] args) {
       int[] nums = new int[]{4,1,2,1,2};
       System.out.println(singleNumber(nums)); 
    }
}