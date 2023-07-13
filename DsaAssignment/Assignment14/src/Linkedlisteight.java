// Java program for the above approach
import java.io.*;
import java.util.*;

// A Linked List Node
class Listlisteight {
	int val;
	Listlisteight next;

	// Constructor
	Listlisteight(int val)
	{
		this.val = val;
		this.next = null;
	}
}

class GFG {

	// Function to create Node
	static Listlisteight getNode(int data)
	{
		Listlisteight temp = new Listlisteight(data);
		return temp;
	}

	// Function to print the Linked List
	static void printList(Listlisteight head)
	{
		while (head.next != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.print(head.val);
	}

	// Function that removes continuous nodes
	// whose sum is K
	static Listlisteight removeZeroSum(Listlisteight head, int K)
	{
		// Root node initialise to 0
		Listlisteight root = new Listlisteight(0);

		
		root.next = head;

		Map<Integer, Listlisteight> umap
			= new HashMap<Integer, Listlisteight>();

		umap.put(0, root);

		int sum = 0;

		// Traversing the Linked List
		while (head != null) {

			// Find sum
			sum += head.val;

			if (umap.containsKey(sum - K)) {

				Listlisteight prev = umap.get(sum - K);
				Listlisteight start = prev;

				
				int aux = sum;

				// Update sum
				sum = sum - K;

				while (prev != head) {
					prev = prev.next;
					aux += prev.val;
					if (prev != head) {
						umap.remove(aux);
					}
				}

				
				start.next = head.next;
			}

			else if (!umap.containsKey(sum)) {
				umap.put(sum, head);
			}

			head = head.next;
		}

	
		return root.next;
	}

	// Driver code
	public static void main(String[] args)
	{
		// head Node
		Listlisteight head;

		head = getNode(1);
		head.next = getNode(2);
		head.next.next = getNode(-3);
		head.next.next.next = getNode(3);
		head.next.next.next.next = getNode(1);

		// Given sum K
		int K = 5;

		
		head = removeZeroSum(head, K);

		if (head != null)
			printList(head);
	}
}

