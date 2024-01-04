/*
Final Lab 3 Task 1(L4)
Create a stack using the linked list with only the push method.
 */
public class StackList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    Node head;
    Node tail;
    public boolean push(int element){
        Node node=new Node(element);
        if(head==null){
            head=tail=node;
            System.out.println(element+" has been pushed into the stack ");
        }
        else{
            tail.next=node;
            tail=node;
            System.out.println(element+" has been pushed into the stack ");
        }
        return true;
    }
    public void printStack(){
        Node current=head;
        System.out.println(current.next.next.data);
        System.out.println(current.next.data);
        System.out.println(current.data);
    }
    public static void main(String[] args) {
        StackList sl=new StackList();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.printStack();

    }
}
