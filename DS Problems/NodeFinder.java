/*
Final Lab 4 Task 1(L3 Q2)
Create a Doubly Linked List. Include Insert() and Search() and return the values of the targeted node's previous and next node.
 */
import java.util.Scanner;
public class NodeFinder {
    class Node{
        int data;
        Node previous;
        Node next;
    }
    Node head;
    Node tail;
    public void insert(int element){
        Node tempNode=new Node();
        tempNode.data=element;
        tempNode.next=null;
        tempNode.previous=null;
        if(head==null){
            head=tail=tempNode;
        }
        else{
            tail.next=tempNode;
            tempNode.previous=tail;
            tail=tail.next;
        }
    }
    public void search(int element){
        Node current=head;
        boolean isFound=false;
        if(head==null){
            System.out.println("Doubly Linked List is empty");
        }
        else{
            while(current!=null){
                if(current.data==element){
                    isFound=true;
                    break;
                }
                current=current.next;
            }
            if(isFound==false){
                System.out.println("There is no such node found");
            }
            else if(current.previous==null){
                System.out.println("It's previous node is null");
                System.out.println("Next Node's value is:"+current.next.data);
            }
            else if(current.next==null){
                System.out.println("It's next node is null");
                System.out.println("Previous Node's value is:"+current.previous.data);
            }
            else if(isFound){
                System.out.println("Previous Node's value is:"+current.previous.data);
                System.out.println("Next Node's value is:"+current.next.data);
            }
        }
    }
    public void showDoublyLinkedList(){
        Node current=new Node();
        current=head;
        System.out.print("Doubly Linked List:");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        NodeFinder nodeFinder=new NodeFinder();
        nodeFinder.insert(22);
        nodeFinder.insert(32);
        nodeFinder.insert(42);
        nodeFinder.insert(21);
        nodeFinder.insert(51);
        nodeFinder.showDoublyLinkedList();
        System.out.print("\nEnter the value:");
        int search=input.nextInt();
        System.out.println("Targeted Node:"+search);
        nodeFinder.search(search);
    }
}
