public class Stack {
    private int Mystack[]=new int[5];
    public int counter=0;
    public int max=5;
    public void push(int element){
        //If the number of elements in the stack is same as the maximum stack size we cannot insert
      if(counter==max){
          System.out.println("Stack is Full cannot insert");
      }
      else{
          //Elements gets stored in the stack with initial index as 0 which gets incremented afterwards
          Mystack[counter]=element;
          counter++;
          System.out.println(element+" is inserted in the stack successfully");
      }
    }
    public void pop(){
        //If the index still remains at 0 that means there is no element inserted in the stack so we cannot pop or remove
        if(counter==0){
            System.out.println("Cannot Pop,Stack is Empty");
        }
        else{
            //The last element gets removed with the decrement as we know in stack the last element gets removed first
            counter--;
            System.out.println("Pop Operation Completed Successfully");
        }
    }
    public int top(){
        //Returns the top element of the stack
        return Mystack[counter-1];
    }
    public void showStack(){
        //If the index still remains at 0 that means there is no element inserted in the stack so we cannot print anything
        if(counter==0){
            System.out.println("Stack is Empty Cannot Show");
        }
        else{
            //Prints the Stack
            for(int i=counter-1; i>=0; i--){
                System.out.println(Mystack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.showStack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.pop();
        s1.showStack();
        System.out.println("The Top Element is:"+s1.top());
    }
}
