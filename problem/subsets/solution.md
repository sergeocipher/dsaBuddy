# Subsets

## Problem statement 

Given an integer array nums of unique elements, return all possible subsets (the power set).

## approach 

- it is a backtracking question 
- so at every steps , we have two element of choice choose it or skips it 
- then backtrack to undo the option 

## Notes

- List is just inteface
- Interface is for method declaration , a class provide implementation
- List need a class that implements List interface.


## Complexity 

- Time_complexity:
- no recursive call * cost = 2 ^ (n+1)
- cost  of 
- internal  nodes : 2^n
- Leaf Nodes : 2^n * O(n)  : n is num.length

- space complexity 
- the auxilary space : recursion Space O(n) (the depth)
- at leaf nodes : (2^n) * O(n)