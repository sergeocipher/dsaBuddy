package generateParen;

import java.util.*;

public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		generateParenthesis(A);
	}

    public static void generateParenthesis(int A) {
    	ArrayList<StringBuilder> ans = new ArrayList<>();
    	helper(ans , new StringBuilder() , 0 , 0 , A , 0);
    	String[] fl = listToArr(ans);
    	print(fl);
    }
    
    public static void helper(ArrayList<StringBuilder> ans , StringBuilder curr , int openBrac , int closingBrac , int A , int index){
    	if (index == 2*A){
    		ans.add(new StringBuilder(curr));
    		return;
    	}
    	
    	if (openBrac < A){
    		curr.append("(");
    		helper(ans , curr , openBrac+1 , closingBrac , A , index+1);
    		curr.deleteCharAt(curr.length() - 1);
    	}
    	
    	if (closingBrac < openBrac){
    		curr.append(")");
    		helper(ans , curr , openBrac , closingBrac+1 , A ,  index+1);
    		curr.deleteCharAt(curr.length() - 1);
    	}
    }
    
    public static String[] listToArr(ArrayList<StringBuilder> ans){
    	String[] fl = new String[ans.size()];
    	for (int i = 0 ; i < ans.size() ; i++){
    		fl[i] = ans.get(i).toString();
    	}
    	return fl;
    }

	public static void print(String[] arr){
		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[0].length(); j++){
				System.out.print(arr[i].charAt(j));
			}
			System.out.println();
		}
	}

	
}
