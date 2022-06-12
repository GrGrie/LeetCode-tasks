/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n, current = left + (right - left)/2;
        while(left <= right){
            current = left + (right - left)/2;
            if(isBadVersion(current) && !isBadVersion(current-1)) break;
            if(isBadVersion(current)) right = current - 1;
            else left = current + 1;
        }
        return current;
    }
}
// 2126753390\n1702766719
// @lc code=end

