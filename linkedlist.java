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
    /* Adding the key to the node*/
    
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
    
    
   
    /* Printing the list*/
  
    
    public void print() {
    	Node temp = head;
    	System.out.println("LinkedList:");
    	while(temp !=null)
    	{
    		System.out.println(temp.data+ " -> ");
    		temp =temp.next;
    	}
    }
    
   /* Inserting a key at a particular position*/
    public void insertAtPos(int pos,int data) {

        
        if(pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        else if(pos==1) {
            push(data);
        }
        else
        {
            int count = 1;
            Node newNode = new Node(data);
            Node temp = head;
            Node cur = null;
            while(count<pos) {
                cur = temp;
                temp = temp.next;
                count++;
            }
            newNode.next = temp;
            cur.next = newNode;
        }
        
        
      }
 }
    	


    

