import java.util.Scanner;
public class DSLab_Task_5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        System.out.print("Enter the number for which you want to find the frequency:");
        int search=sc.nextInt();
        int count=0;
        for(int i=0; i<A.length; i++){
            if(search==A[i]){
            count++;
            }
        }
        System.out.println(search + " appears "+count+" times");
    }
}
