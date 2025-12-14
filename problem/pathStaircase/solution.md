#  Print paths in Staircase

## problem Statement

You are climbing a staircase and it takes A steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


## Aproach 

- we are doing this using back tracking 
- ar each step we have two element of choice +1 or +2 
- then we hut base case backtrack -1 

## complexity

- Time: O(2^n)
- space : Auxilary (recursion O(n));
