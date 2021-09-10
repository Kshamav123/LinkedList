package lcom.list;

public class linkedlist {
	
	private Node head;//no other class can access head
	
    private class Node{
    	
    	int data;
    	Node next;
    	
    	Node(int data){
    		this.data=data;
    		next = null;
    		
    		
    	}
    }
    /* Adding the node*/
    
    public boolean add(final int data) {
    	boolean isAdded = false;
    	Node newNode = new Node(data);
    	if (head==null) {
    		head=newNode;
    		isAdded = true;
    	}
    	else {
    		Node temp = head;
    		
    		while(temp.next!=null) {
    			temp = temp.next;
    		}
    		temp.next = newNode;
    		isAdded = true;
    	}
    	
    	return isAdded;
    }
    
    
    public void push(int data)
    {
    	Node newNode =new Node(data);
    	newNode.next = head;
    	head = newNode;
    	
    	
    }
    
  
    
    public void print() {
    	Node temp = head;
    	System.out.println("LinkedList:");
    	while(temp !=null)
    	{
    		System.out.println(temp.data+ " -> ");
    		temp =temp.next;
    	}
    }
    
    public void insertAtPos(int pos,int data) {
    	if(pos<1) {
    		System.out.println("Invalid pos");
    		return;
    	}
    
    	if( pos ==1) {
    		push(data);
    		
    	}
    	else {
    		Node newNode = new Node(data);
    		Node temp = head;
    		int count=1;
    		while(count<pos)
    		{
    			temp =temp.next;
    			count++;
    		}
    		Node curr = temp.next;
    		temp.next=newNode;
    		newNode.next = curr;
    	}
    	
    }
    }

