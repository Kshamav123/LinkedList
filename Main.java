package lcom.list;

public class Main {
        public static void main(String[] args)
        {
        	linkedlist list1= new linkedlist();
        	list1.add(56);
        	list1.add(30);
        	list1.add(70);
        	//list1.popLast();
        	//list1.insertAtPos(3, 40);
                list1.searchKey(30);
        	list1.print();
        }
        
}
