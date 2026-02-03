import java.util.*;

public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>(); 
        Arrays.sort(candidates);
        helper(ans , new ArrayList<>() , target , candidates , 0 , 0);
        return ans;
    }
    
    public void helper(List<List<Integer>> ans , List<Integer> curr , int target , int[] arr , int sum , int index){
    	if (sum > target) return;
    	if (sum == target){
    		ans.add(new ArrayList<>(curr));
    		return;
    	}
    	for (int i = index ; i < arr.length ; i++){
    		curr.add(arr[i]);
    		helper(ans , curr , target , arr , sum + arr[i] , i);
    		curr.remove(curr.size() - 1);
    		if (sum + arr[i] >= target) return;
    	}
    }

}

// here pruning + sorting reduces the recursion 
// index cotrol the duplicates 
// time complexity: worst case (O(n^ T/minval))