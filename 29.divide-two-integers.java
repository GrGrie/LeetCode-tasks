/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */
// @lc code=start
class Solution {
    private boolean isPositive(int a){
        if(a >= 0) return true;
        else return false;
    }
    public int divide(int dividend, int divisor) {
         /*
        So for this solution I remembered old 2nd or 3rd grade definition of division:
        It is like substraction, but multiple times. This idea is used in the main part of my code
        */

        if(dividend > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(dividend < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(divisor == 1) return dividend;

        int answer = 0;
        
        if(isPositive(dividend) && isPositive(divisor)){
            while(dividend - divisor >= 0){
                dividend -= divisor;
                if(answer+1 != Integer.MAX_VALUE) answer++;
                else return Integer.MAX_VALUE;
            }
        } else if(!isPositive(dividend) && !isPositive(divisor)){
            while(dividend - divisor <= 0){
                dividend -= divisor;
                if(answer+1 != Integer.MAX_VALUE) answer++;
                else return Integer.MAX_VALUE;
            }
        }else{
            if(isPositive(dividend)){
               while(dividend + divisor >= 0){
                    dividend += divisor;
                    if(answer-1 != Integer.MIN_VALUE) answer--;
                    else return Integer.MIN_VALUE;
                } 
            } else if (!isPositive(dividend)){
                while(dividend + divisor <= 0){
                    dividend += divisor;
                    if(answer-1 != Integer.MIN_VALUE) answer--;
                    else return Integer.MIN_VALUE;
                } 
            }
        } 
        return answer;
    }
}
// @lc code=end

