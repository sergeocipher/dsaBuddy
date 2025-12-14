package problem.pathStaircase;
import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> WaysToClimb(int A) {
    	ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    	ArrayList<Integer> curr  = new ArrayList<>();
    	helper(A , ans , curr , 0);
    	return ans;
    }
    public static void helper(int A , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> curr , int sum){
    	if (sum == A){
    		ans.add(new ArrayList<>(curr));
    		return;
    	}
    	if (sum > A){
    		return;
    	}
        curr.add(1);
        sum += 1;
	helper(A , ans , curr , sum	) ;
    	sum -= 1;
        curr.remove(curr.size() - 1);

        curr.add(2);
    	helper(A , ans , curr , sum + 2);
        curr.remove(curr.size() - 1);
    } 
}
