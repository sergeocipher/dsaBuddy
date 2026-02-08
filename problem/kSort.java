import java.util.*;

public class kSort {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for (int i = 0 ; i < lists.length ; i++){
            if (lists[i] == null) continue;
            heap.add(lists[i]);
        }

        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (!heap.isEmpty()){
            curr.next = heap.poll();
            curr = curr.next;
            ListNode node = curr.next;
            if (node != null) heap.add(node);
            
        }

        return head.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  // time complxity : nlogk
  // intial loop -> klogk
  // while loop -> nlogk where n is the total no of nodes 
  
  // space complexity -> O(k)

  // Process N items using a heap of size k → time = O(N log k)

class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0 ; i < t ; i++){
		    int n = sc.nextInt();
		    
		    int count = 0;
		    int finalCount = 0;
		    for (int j = 0 ; j < n ; j++){
		        int b = sc.nextInt();
		        if (b == 0) {
		            finalCount = (count < finalCount)? finalCount : count;
		            count = 0;
		        }
		        else count++;
		    }
		    if (n == 1) finalCount = count;
		    System.out.println(finalCount);

		}
		sc.close();

	}
}
