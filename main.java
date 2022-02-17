import java.util.Scanner;

import java.util.*;
class main {
    public static void main(String args[]) {

        System.out.println("Start");
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Please enter -2 if you dont want to add more nodes");
        int temp = scan.nextInt();
        
        SLL linkedlist = new SLL();


        while (temp != -2){
            linkedlist.Insert(temp);
            temp = scan.nextInt();
        }
        System.out.print("The SLL is :  ");
        linkedlist.PrintLL();
        System.out.println();

        linkedlist.Delete();

        System.out.print("The SLL is :  ");
        linkedlist.PrintLL();
        System.out.println();

        linkedlist.Search(2);
    
        scan.close();
        System.out.println("End");
    }
}

