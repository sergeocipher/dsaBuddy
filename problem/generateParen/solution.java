import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> result = generateParenthesis(n);
        
        // Print results
        for (String paren : result) {
            System.out.println(paren);
        }
        
        sc.close();
    }
    
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int n) {
        // Base case: we've used n open and n close parentheses
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        
        // Add opening parenthesis if we haven't used all n open parentheses
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        
        // Add closing parenthesis if close count < open count (to maintain validity)
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
