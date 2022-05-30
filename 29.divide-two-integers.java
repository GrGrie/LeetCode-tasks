/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */
// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        
        /* 
            I found this solution in discussion, I understand that I need to work with bit-manipulation and shifts, but
            idk how for the moment and there is only 7 minutes left, so now I am going to watch some tutorials on that.
        */

		// handling special/edge cases
        if (divisor == 0)
            return Integer.MAX_VALUE;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        
		// decide sign of resultant
        boolean isPositive = true;
        if (divisor < 0 ^ dividend < 0)
            isPositive = false;
        
		// using long to handle cases like, dividend = INT_MIN, divisor = 1
        long divid = Math.abs((long)dividend);
        long divis = Math.abs((long)divisor);
        
		// ans to store final result
        int ans = 0;
        while (divid >= divis) {
            
			// calculate number of left shifts
            int shifts = 0;
            while (divid >= (divis << shifts))
                shifts ++;
            
			// update answer
            ans += (1 << (shifts - 1));
			
			// dividend minus the largest shifted divisor
            divid -= (divis << (shifts - 1));
        }
		
		// return answer alongwith sign
        if (isPositive)
            return ans;
        return -ans;
    }
}
// @lc code=end

