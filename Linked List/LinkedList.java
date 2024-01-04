/*
Final Lab 2 Task 1(L3 Q1)
Linked List Implementation with Java
 */
import java.util.Scanner;
public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    Node last;
    public void insertAtEnd(int data){
        Node node=new Node(data);
        //If head is null then the both head and tail are same
        if(head==null){
            head=node;
            last=node;
            System.out.println(data+" has been added successfully at the end");
        }
        //else the tail holds the address next value gets copied into the tail and tail is the new node
        else{
            last.next=node;
            last=node;
            System.out.println(data+" has been added successfully at the end");
        }
    }
    public void insertAtStart(int data){
        Node node=new Node(data);
        //if head is null then both head and tail means the last will be the same
        if(head==null){
            head=node;
            last=node;
            System.out.println(data+" has been added successfully at the start");
        }
        /*The current head object gets stored into a temporary object new head address gets copied into the current head and current head address
        becomes next node*/
        else{
            Node temp=head;
            head=node;
            head.next=temp;
            System.out.println(data+" has been added successfully at the start");
        }
    }
    public void deleteAnElement(int index){
        Node current=head;
        Node previous=null;
        int i=0;
        while(current!=null && i!=index){
            previous=current;
            current=current.next;
            i++;
        }
        //If we want to delete from the start then we will just head make point to the next node
        if(previous==null){
            head=head.next;
        }
        //in any other scenario we will just make the previous node's next address becoming null
        else{
            previous.next=current.next;
        }
        current.next=null;
    }
    public void searchInList(int element){
        Node current=head;
        boolean isFound=false;
        int i=1;
        if(head==null){
            System.out.println("Linked List in Empty");
        }
        else{
            //If head is not null then the linked list will be traversed to find the element
            while(current!=null){
                if(current.data==element){
                    isFound=true;
                    break;
                }
                current=current.next;
                i++;
            }
        }
        if(isFound){
            System.out.println("Element Found in the node "+i);
        }
        else{
            System.out.println("There is No such element in the linked list");
        }
    }
    public void insertAtAnyIndex(int element,int index){
        Node node=new Node(element);
        Node current=head;
        Node temp=head;
        //If linked list is empty then we can use another method
        if(head==null){
            System.out.println("Linked List is Empty");
        }
        //We have to traverse to the index after which we want to insert and that old value will be stored into a temp object
        else{
            for(int i=0; i<index && current.next!=null; i++){
                temp=current;
                current=current.next;
            }
            //the newest node will have the address of current node's next node's address
            node.next=current;
            //that previous node will have the address of current newNode which has been inserted
            temp.next=node;
        }
    }
    public void showSinglyLinkedList(){
        Node current=head;
        //Traversing to the nodes one by one and printing their data
        while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        LinkedList link=new LinkedList();
        link.insertAtEnd(10);
        link.insertAtEnd(20);
        link.insertAtEnd(30);
        System.out.print("Linked List After Inserting at the end:");
        link.showSinglyLinkedList();
        System.out.println();
        link.insertAtStart(5);
        System.out.print("Linked List after Inserting at the start:");
        link.showSinglyLinkedList();
        System.out.print("\nLinked List after Insertion at Specific Index:");
        link.insertAtAnyIndex(15,1);
        link.showSinglyLinkedList();
        System.out.println();
        System.out.print("Enter the element to search:");
        int search=input.nextInt();
        link.searchInList(search);
        System.out.print("Linked List After Removing from first node:");
        link.deleteAnElement(0);
        link.showSinglyLinkedList();
        System.out.print("\nLinked List After Removing from the middle node:");
        link.deleteAnElement(1);
        link.showSinglyLinkedList();
        System.out.print("\nLinked List After Removing the last node:");
        link.deleteAnElement(2);
        link.showSinglyLinkedList();
    }
}
