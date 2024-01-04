/*
Final Lab 1 Task 1(L1)
Implement a static method, bSort() that takes as input parameter, an unsorted integer array and returns a sorted integer array.
Execute your program from the main method by calling the bSort() method and passing an unsorted array.Output the values of both sorted and unsorted array.
int[] bSort(int[] myArray){// Bubble sort here
 */
public class BubbleSort {
    public static int[]bSort(int[] myArray){
     int length= myArray.length;
     int temp;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(myArray[j]>myArray[j+1]){
                    temp=myArray[j];
                    myArray[j]=myArray[j+1];
                    myArray[j+1]=temp;
                }
            }
        }
        return myArray;
    }
    public static void main(String[] args) {
      int arr[]=new int[]{15,7,91,55,32};
        System.out.print("Unsorted Array:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        bSort(arr);
        System.out.print("\nSorted Array:");
        for(int y:arr){
            System.out.print(y+" ");
        }
    }
}
