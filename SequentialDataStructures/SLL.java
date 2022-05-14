package SequentialDataStructures;
// Singly Linked List
/*
    Propierties : 
        1. Use of Nodes
        2. Sequential connected Nodes
        3. Size can grow or shrink
        4. Not waste of memory

    Methods : 
        Insert : O(1) Beggining
        Delete : O(1) Beggining
        Search : O(1)
        PrintSLL : Print the Singly Linked List O(1)
*/

// Private Class for Node
class Node { 
    // Data Members 
    Node next = null ; 
    int data ;
    
    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public Node() {
        this.data = -2 ; 
    }

    // Getters and Setters
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }    
    
}


public class SLL{
    // Data Members
    private Node head; 
    
    // Constructor
    public SLL() {
        head = null;
    }

    // Insert => O(1) Begginig 

    /* Algorithm 

        1. Create a temp Node with the new Data
        2. Change temp.next to head 
        3. Change head to temp 
    
        */
    public void Insert(int data) {
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
        return ;

    }

    // Delete => O(1) Begginig
    /* Algorithm 

        1.  Create a new Temp Node 
        2.  Copy the head into temp
        3.  Change head to temp.next
    
    */
    public void Delete() {
        Node temp = head ;
        head = temp.getNext();
    }

    // Search => O(n)
    /*  Algorithm 

        1. Save the data that will be searched
        2. Start to the head until the Null iteration 
        3. If the data is found return the node, else return "Doesnt exist"

    */
    public Node Search(int data) {
        Node temp = head ;

        while(temp != null){
            if(temp.getData()== data)
                return temp;
            temp = temp.getNext();
        }

        System.out.println("Doesnt Exist");
        return null;
    }

    // PrintLL

    public void PrintLL() {
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.getData() + "   ");
            temp = temp.next;
        }
        return ;
    }

}
