package nDigit;

import java.util.*;

public class nDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> currList = new ArrayList<>();
		
		generate(ans , currList , n);
		print(ans);
	}
	
	public static void generate(ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> currList , int n){
		//base condition
		if (currList.size() == n){
			ans.add(new ArrayList<>(currList));
            return;
		}
		
		currList.add(1);
		generate(ans , currList , n);
		currList.remove(currList.size() - 1); //index
		
		currList.add(2);
		generate(ans , currList , n);
		currList.remove(currList.size() - 1);
	}
	
	public static void print(ArrayList<ArrayList<Integer>> ans){
		for (int i = 0 ; i < ans.size() ; i++){
			for (int j = 0 ; j < ans.get(0).size() ; j++){
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}