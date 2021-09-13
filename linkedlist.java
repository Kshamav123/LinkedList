package lcom.list;

public class linkedlist {

	private Node head;// no other class can access head

	private class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;

		}
	}

	/* Adding the key to the node */

	public boolean add(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		System.out.println("head=" + head);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			System.out.println(temp);
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}

		return isAdded;
	}

	/* pushing the key to the node */

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	/* Printing the list */

	public void print() {
		Node temp = head;
		System.out.println("LinkedList:");
		while (temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
	}

	/* Inserting a key at a particular position */

	public void insertAtPos(int pos, int data) {

		if (pos <= 0) {
			System.out.println("Invalid position");
			return;
		} else if (pos == 1) {
			add(data);
		} else {
			int count = 1;
			Node newNode = new Node(data);
			Node temp = head;
			Node cur = null;
			while (count < pos) {
				cur = temp;
				temp = temp.next;
				count++;
			}
			newNode.next = temp;
			cur.next = newNode;
		}

	}

	/* Deleting the first element */

	public void pop() {
		Node temp = head;
		head = temp.next;

	}

	
	/* Deleting the last element*/
	public void popLast() {
        Node temp = head;
        Node cur = null;
        while(temp!=null && temp.next!=null) {
        	cur = temp;
        	temp = temp.next;
        	
        }
        cur.next = null;
	}


       /*searching for a particular key*/
	
	public void searchKey(int key) {
		Node temp = head;
		int pos = 1;
		while(temp != null)
		{
			
			if (temp.data==key) {
				System.out.println(+key+" found at position "+pos);
		}
			temp = temp.next;
			pos = pos+1;
			
		}
		
	}
	
	/* inserting the data after the key*/
	
	public void insertKey(int key, int data)
	{
		Node newNode = new Node(data);
		Node temp =head;
		while(temp !=null) {
			if (temp.data==key)
			{
				newNode.next=temp.next;
				temp.next=newNode;
			}
			temp=temp.next;
		}
	}
}