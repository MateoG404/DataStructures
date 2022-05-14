package SequentialDataStructures; 
// Class to Double Linked List

/* Propierties
*/

public class DLL {
    // Class Node for the DLL
    class Node{
        int data ; 
        Node prev ; 
        Node next ;
        
        // Constructor
        public Node(int data) {
            this.data = data; 
            this.prev = null ; 
            this.next = null ;
        }
        public Node() {
            this.prev = null ; 
            this.next = null ;
        }
        // Getters and Setters

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        } 
        
    }


    // Data members
    Node head ;
    Node tail ;

    // Constructor for the DLL 

    public DLL(){
        head = new Node(); 
        tail = new Node();
        head.setNext(tail);
        tail.setPrev(head);
    }

    // Methods 

    // Insert 

        // At Begginig -> Similar to a SLL
    public void InsertBegging(int data) {
        Node temp = new Node(data); 
        temp.setNext(head.getNext());
        head.setNext(temp);
        temp.setPrev(head);
        temp.getNext().setPrev(temp);
        return ;
    }
        
        // At the End  -> Similar to SLL but change the head by the Tail
    public void InsertEnd(int data) {
        Node temp = new Node(data);
        temp.setPrev(tail.getPrev());
        tail.getPrev().setNext(temp);
        temp.setNext(tail);
        tail.setPrev(temp);    
    }
        
        // Before a Node -> Insert before the node given
    public void InsertBefore(Node beforeNode, int data){
        Node temp = new Node(data); 
        temp.setPrev(beforeNode.getPrev());
        beforeNode.getPrev().setNext(temp);
        temp.setNext(beforeNode);
        beforeNode.setPrev(temp);
    }
        
        // After a Node -> Insert after the node given
    public void InsertAfter(Node afterNode,int data) {
        Node temp = new Node(data); 
        temp.setPrev(afterNode);
        temp.setNext(afterNode.getNext());
        afterNode.getNext().setPrev(temp);
        afterNode.setNext(temp);
    }
    // Delete

        // At Begginig
    public void DeleteBeggining() {
        Node temp = head ;
        head.setNext(temp.getNext().getNext());
        head.getNext().setPrev(head);
    }
       
        // At the End 
    public void DeleteEnd() {
        Node temp = tail ;
        tail.setPrev(temp.getPrev().getPrev());
        tail.getPrev().setNext(tail);
    }

        // Before a Node
    public void Delete(Node beforeNode){ // Given the node
        Node temp = beforeNode ; 
        beforeNode.getNext().setPrev(beforeNode.getPrev());
        beforeNode.getPrev().setNext(temp.getNext());
   }

    public void PrintHeadTail() {
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.getData() + "   ");
            temp = temp.getNext();
        }
        return ;
    }
    public void PrintTailHead() {
        Node temp = tail ; 
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.getPrev();
        }
    }
}
