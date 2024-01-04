/*
Final Lab 1 Task 2 (L2)
Create an application, SortFinder, that uses bubble sort to sort an unordered integer array and then uses binary search to find a target value.
Then output the index of the target value on the console.The array can contain only unique values.
 */
import java.util.Scanner;
public class SortFinder{
    public static int[] arrayGenerate(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=input.nextInt();
        int[] myArray=new int[size];
        System.out.print("Enter the Array Elements:");
        for(int i=0; i< myArray.length; i++){
            boolean isUnique=true;
            //While loop to check the uniqueness of the array elements
            while(isUnique){
                myArray[i]=input.nextInt();
                isUnique=false;
                for(int j=0; j<i; j++){
                    if(myArray[j]==myArray[i]){
                        System.out.println("Enter unique elements only");
                        System.out.println();
                        isUnique=true;
                        //If the element is already present then the loop will break and tell u to enter again
                        break;
                    }
                }
            }
        }
        System.out.print("Unsorted Array:");
        for(int x:myArray){
            System.out.print(x+" ");
        }
        return myArray;
    }
    public static int[]bSort(int[] myArray){
        int length= myArray.length;
        int temp;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                //We will compare two adjacent elements if the left sided one is bigger then we swap with the smaller value
                if(myArray[j]>myArray[j+1]){
                    temp=myArray[j];
                    myArray[j]=myArray[j+1];
                    myArray[j+1]=temp;
                }
            }
        }
        System.out.print("\nSorted Array:");
        for(int y:myArray){
            System.out.print(y+" ");
        }
        return myArray;
    }
    public static int bSearch(int[]myArray){
        Scanner input=new Scanner(System.in);
        int l_index=0;   //l_index refers to lower index
        int h_index=myArray.length-1; //h_index refers to highest index
        int m_index=(l_index+h_index)/2;//m_index refers to middle index
        System.out.print("\nEnter the Element you want to find:");
        int element=input.nextInt();
        while(l_index<=h_index){
            //If element gets Found in the Middle Index
            if(myArray[m_index]==element){
                System.out.println("Element Found in the " +m_index + " nd/th/rd index");
                break;
            }
            //If element gets found in the right side of the middle index it shifts by one right side
            else if(myArray[m_index]<element){
                l_index=m_index+1;
            }
            //If element gets found in the left side of the middle index it shifts by one left side
            else{
                h_index=m_index-1;
            }
            //Finding the new index position for that searched element
            m_index=(l_index+h_index)/2;
        }
        //If the lower index is bigger which is impossible then we can say the element is not found
        if(l_index>h_index){
            System.out.println("Element not Found");
        }
        return element;
    }
    public static void main(String[] args) {
        SortFinder.bSearch(SortFinder.bSort(SortFinder.arrayGenerate()));
    }
}
