public class Queue {
    private int queue[]=new int[10];
    int front=-1;
    int rear=-1;
    int max=10;
    public void enqueue(int element){
        //If rear element is in the last index we cannot insert
        if(rear == max-1){
            System.out.println("Queue is Full cannot Insert");
        }
        else if((front == -1) && (rear == -1)){
            //Front and Rear needs to be declared as zero while Inserting if the queue is empty
              front=rear=0;
              queue[rear]=element;
            System.out.println(element+" has been inserted in the queue");
        }
        else{
            //When queue already have some elements we will just insert in the rear index and increment the rear count as queue only allows you to insert in the last
            rear++;
            queue[rear]=element;
            System.out.println(element+" has been inserted in the queue");
        }
    }
    public void dequeue(){
        //If front and rear is -1 then the queue is empty so we cannot dequeue or remove element from there
        if((front == -1) && (rear == -1)){
            System.out.println("Queue is Empty cannot dequeue");
        }
        //If front and rear both are in the same position then both needs to be decremented
        else if(front==rear){
            front=rear=-1;
            System.out.println("Dequeue Successful");
        }
        else{
            //If front and rear is in different position we will increase the index value of the front
            front++;
            System.out.println("Dequeue Successful");
        }
    }
    public int peek(){
        //It will return the front element of the queue
        return queue[front];
    }
    public void showQueue(){
        //If front and rear is -1 then the queue is empty so we cannot print anything
        if((front == -1) && (rear == -1)){
            System.out.println("Queue is empty cannot show");
        }
        else{
            //Prints the Queue
            System.out.print("The Queue:");
            for(int i=front; i<=rear; i++){
                System.out.print(queue[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.showQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.showQueue();
        System.out.println();
        q.dequeue();
        q.showQueue();
        System.out.println();
        System.out.println("Needle:"+q.peek());
    }

}
