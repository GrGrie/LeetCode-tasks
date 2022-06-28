import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        dfs(new Stack<Integer>(), 1, n, k, result);
        return result;
    }
    
    private void dfs(Stack<Integer> path, int index, int n, int k, List<List<Integer>> result){
        // ending case
        if(k==0){
            List<Integer> list = new ArrayList<Integer>(path);
            result.add(list);
            return;
        }
        // recursion case
        for(int i = index;i <= n;i++){
            path.push(i);
            dfs(path, i+1, n, k-1, result);
            path.pop();
        }
    }
}
// @lc code=end

