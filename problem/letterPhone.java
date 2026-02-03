package problem;
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        adding(map);
 	List<String> ans = new ArrayList<>();
 	helper(ans , new StringBuilder() , 0 , digits , map);
 	return ans;
    }
    
    public void helper(List<String> ans , StringBuilder sb , int index , String digits , HashMap<Character , String> map){
    	if (index == digits.length()){
    		ans.add(sb.toString());
    		return;
    	}
    	
    	for (int i = 0 ;  i < map.get(digits.charAt(index)).length() ; i++){
    		sb.append(map.get(digits.charAt(index)).charAt(i));
    		helper(ans , sb , index + 1 , digits , map);
    		sb.deleteCharAt(sb.length() -1);
    	}
    }
    
    public void adding(HashMap<Character , String> map){
    	map.put('2' , "abc");
    	map.put('3' , "def");
    	map.put('4' , "ghi");
    	map.put('5' , "jkl");
    	map.put('6' , "mno");
    	map.put('7' , "pqrs");
    	map.put('8' , "tuv");
    	map.put('9' , "wxyz");
    }
}