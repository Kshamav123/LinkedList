package lcom.list;



public class SortedList {
	Node head;

	public class Node<T extends Comparable<T>> {
		Node next;
		T data;

		Node(T data) {
			this.data = data;
			next = null;
		}

	}

	public <T extends Comparable<T>> void add1(T data) {

		Node<T> newNode = new Node<T>(data);
		if (head == null || head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null && temp.next.data.compareTo(data) < 0) {
				temp = temp.next;

			}
			newNode.next = temp.next;
			temp.next = newNode;
		}

	}

	public void print() {
		Node temp = head;
		System.out.println("LinkedList:");
		while (temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
	}
}