# question: generate n digit using 1 and 2

Write a program to generate all n-digit sequences composed of digits 1 and 2.

Example input: `3`

Example output:

```
1 1 1
1 1 2
1 2 1
1 2 2
2 1 1
2 1 2
2 2 1
2 2 2
```

- here we have used backtracking.
- at each step we have two element of choice either 1 or 2.
- At each step we chose one choice then call for the remening place.
- until we hit the base condtion which is pointer is equal to n.
- then in the base cindition we add a deep copy of the cuurlist to ans list.
- then we backtrack to previous step poping.
- then choose a different choice "2".

## note

- In the base condition we are adding deep copy because we are modifying the same list again and again.
- so all the element in the ans will point towards the same currList object.
- so if we change it then all element will get affected.


# Complexity 

- Time_complexity: O(n*2^n) 
- at each postion we have two choices 2*2*2*2 .....n
- we are deoing deep copy at leaf nodes O(n) for 2^n leaf node

- Space_complexity: O(n*2^n);
- for recursion stack : max depth is n
- Storing results : we are storing list for all leaf nodes (2^n)*n