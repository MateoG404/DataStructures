package SequentialDataStructures;
import java.util.Scanner;


class main {


    public static void main(String args[]) {

        System.out.println("Start");
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Please enter -2 if you dont want to add more nodes");
        int temp = scan.nextInt();
        
        CLL linkedlist = new CLL();
        Node head = null;

        while (temp != -2){
            head = linkedlist.InsertEnd(head,temp);
            temp = scan.nextInt();
        }
        System.out.println();
        System.out.println();

        linkedlist.Print(head);
        
        scan.close();
        System.out.println("End");
    }
}

