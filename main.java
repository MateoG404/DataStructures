import java.util.Scanner;

import java.util.*;
class main {
    public static void main(String args[]) {

        System.out.println("Start");
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Please enter -2 if you dont want to add more nodes");
        int temp = scan.nextInt();
        
        DLL linkedlist = new DLL();


        while (temp != -2){
            linkedlist.InsertEnd(temp);
            temp = scan.nextInt();
        }
        linkedlist.InsertBefore(linkedlist.head.getNext(), 5);
        linkedlist.InsertAfter(linkedlist.head.getNext(), 9);
        System.out.println();
        System.out.println("The double linked list is :");

        linkedlist.PrintHeadTail();
        System.out.println();
        linkedlist.PrintTailHead();
        System.out.println();
        System.out.println();
        System.out.println(linkedlist.head.getNext().getNext().getData());
        linkedlist.Delete(linkedlist.head.getNext().getNext());
        
        System.out.println();
        System.out.println("The double linked list is :");

        linkedlist.PrintHeadTail();
        System.out.println();
        linkedlist.PrintTailHead();
        scan.close();
        System.out.println("End");
    }
}

