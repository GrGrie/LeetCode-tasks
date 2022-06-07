/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstArrayIterator = 0;
        int secondArrayIterator = 0;
        
        //Let's create another array, which is copy of first 'm' elements of nums1[]
        int[] array1 = new int[m];
        for(int i = 0; i < m; i++) array1[i] = nums1[i];

        while(firstArrayIterator + secondArrayIterator < m + n){
            // If one of the arrays are empty, then just add from another
            if(firstArrayIterator == m || secondArrayIterator == n){
                // If first one is empty, add from the second
                if(firstArrayIterator == m){
                    nums1[firstArrayIterator + secondArrayIterator] = nums2[secondArrayIterator];
                    secondArrayIterator++;
                } else if(secondArrayIterator == n) { // Else if the second is empty add from the first
                    nums1[firstArrayIterator + secondArrayIterator] = array1[firstArrayIterator];
                    firstArrayIterator++;
                }
            // Else just add them corresponding to their values and Iterators    
            } else if(array1[firstArrayIterator] <= nums2[secondArrayIterator]){
                nums1[firstArrayIterator + secondArrayIterator] = array1[firstArrayIterator];
                firstArrayIterator++;
            } else {
                nums1[firstArrayIterator + secondArrayIterator] = nums2[secondArrayIterator];
                secondArrayIterator++;
            }
        }
    }
}
// @lc code=end

