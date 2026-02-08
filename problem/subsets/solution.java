package subsets;

import java.util.*;
class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        
        helper(nums , ans , curr , 0);
        return ans;
    }
    
    public static void helper(int[] nums , List<List<Integer>> ans , List<Integer>  curr , int index){
    	if (index == nums.length){
    		ans.add(new ArrayList<>(curr));
    		return;
    	}
    	
    	curr.add(nums[index]);
    	helper(nums , ans , curr , index + 1);
    	curr.remove(curr.size() - 1);
    	
    	helper(nums , ans , curr , index + 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0 ; i < t ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        List<List<Integer>> ans = subsets(arr);
        print(ans);
    }

    public static void print(List<List<Integer>> arr){
        for (int i =0 ; i < arr.size() ; i++){
            for (int j = 0 ; j < arr.get(i).size() ; j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }
    }
}