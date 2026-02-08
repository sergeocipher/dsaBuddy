import java.util.*;;
class permutationII{
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] arr = new boolean[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            arr[i] = false;
        }
        helper(ans , new ArrayList<>() , 0 , arr , nums);
        return ans;
    }

    public void helper(List<List<Integer>> ans , List<Integer> curr , int index , boolean[] list , int[] nums){
        if (index == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int  i = 0 ; i < nums.length ; i++){
            if (list[i]) continue;

            if (i > 0 && nums[i] == nums[i-1] && !list[i-1]) continue;
            
            list[i] = true;
            curr.add(nums[i]);
            helper(ans , curr , index + 1 , list , nums);
            list[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}


// to remove the duplicated we sort the array 
// then we have to make sute that the previous element smae leemenr thave benn used or not 
// if used then we can used the current 
// so the isight is that we have to use duplicate element in order to remove duplicate 