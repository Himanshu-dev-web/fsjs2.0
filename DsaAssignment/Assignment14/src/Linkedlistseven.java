import java.util.*;
public class Linkedlistseven {
	ListNode head = null;

	// ListNode
	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val)
		{
			this.val = val;
			next = null;
		}
	}
	
	public int[] nextLargerLL(ListNode head)
	{
		// get size of LinkedList
		int count = sizeOfLL(head);
		// make size of ans array equal to size of LL i.e
		// number of nodes in LL
		int[] ans = new int[count];
		// k is for index of ans array
		int k = 0;
		// j will be one step ahead of head node that will
		// check the greater node
		ListNode j;
		// temp is for temporary storing the greater node
		int temp = 0;

		while (head != null) {
		
			if (head.next == null) {
				ans[k] = 0;
				break;
			}
			// j is one step ahead of head
			j = head.next;
			// if head.val is smaller than j.val so add
			// j.val to ans array and increment index (k)
			if (head.val < j.val) {
				ans[k] = j.val;
				k++;
			}
			else if (head.val
					>= j.val) { 
				while (
					j != null
					&& head.val
						>= j.val) { 
					j = j.next;
				}
				
				if (j != null) {
					ans[k] = j.val;
					k++;
				}
				else { 
					ans[k] = 0;
					k++;
				}
			}
			else {
				ans[k] = 0;
				k++;
			}
			head = head.next;
		}
		return ans;
	}

	public void push(int new_data)
	{
		/* allocate node */
		ListNode new_node = new ListNode(new_data);

		new_node.next = head;

		head = new_node;
	}

	public void printList()
	{
		System.out.println(Arrays.toString(nextLargerLL(head)));
	}
	
	//driver code
	public static void main(String[] args)
	{
		Linkedlistseven ll = new Linkedlistseven();

		ll.push(5);
		ll.push(0);
		ll.push(3);
		ll.push(1);
		ll.push(2);

		ll.nextLargerLL(ll.head);
		ll.printList();
	}

	public int sizeOfLL(ListNode head)
	{
		int count = 0;
		while (head != null) {
			count = count + 1;
			head = head.next;
		}
		return count;
	}
}
