import java.util.*;
class combination {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> ans = new ArrayList<>();
      helper(n , k , ans , new ArrayList<>() , 1);
      return ans;  
    }

    public void helper(int max , int count , List<List<Integer>> ans , List<Integer> curr , int num){
        if (curr.size() == count){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = num ; i <= max ; i++){
            curr.add(i);
            helper(max , count , ans , curr , i + 1);
            curr.remove(curr.size() - 1);
        }
       
    }
}

// O(C(n, k) · k) tiem complexity 
// O(k) space complexity excluding output 

// This is a standard backtracking problem where we generate combinations by advancing the start index. The complexity is output-bound: O(C(n, k) · k), with optional pruning to reduce useless recursion.