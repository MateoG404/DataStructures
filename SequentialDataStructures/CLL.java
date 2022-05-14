package SequentialDataStructures;
// Class of the implementation of Circular Linked List

public class CLL {
    // Private Class for Node

    // Data Members

    Node head ; 

    // Constructor
    public CLL(){
        this.head = null;
    }

    
// Methods

    // Insert

        // Empty List

    public Node InsertEmpty(Node temp, int data) {
        if(head != null)
            return temp;
        
        Node newNode = new Node(data); 
        head = newNode;
        head.setNext(head);
        return head ; 
        
    }
        // At Beggining
    public Node InsertBeggining(Node temp,int data) {
        if(head == null)
            return InsertEmpty(temp, data); 
        Node nNode = new Node(data);
        nNode.setNext(head.getNext());
        head.setNext(nNode);
        return head ; 
    
        
    }
        // At end
    public Node InsertEnd(Node temp,int data) {
        if(head == null)
            return InsertEmpty(temp, data); 
        Node nNode = new Node(data);
        head.getNext().setNext(nNode);
        nNode.setNext(head);
        return head;
    }

        // At given location

    // Delete
        // At Begging
        // At End
        // Before a given location 


    // Search

    // Print
    public void Print(Node head) {
        Node temp = head.getNext();

        while(temp != head){
            
            System.out.print(temp.getData() + "  ");
            temp = temp.getNext();
        
        }
        System.out.println(temp.getData());

    }

}
