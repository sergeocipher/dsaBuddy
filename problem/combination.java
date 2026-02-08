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
