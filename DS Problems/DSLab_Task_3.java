import java.util.Scanner;
public class DSLab_Task_3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first array size:");
        int n=sc.nextInt();
        System.out.print("Enter the second array size:");
        int y=sc.nextInt();
        int A[]=new int[n];
        int B[]=new int[y];
        System.out.println("Enter the first array elements:");
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the second array elements:");
        for(int j=0; j<B.length; j++){
            B[j]=sc.nextInt();
        }
        int x=0;
        int C[]=new int[n+y];
        for(int i=0; i<A.length; i++){
            C[x]=A[i];
            x++;
        }
        for(int j=0; j<B.length; j++){
            C[x]=B[j];
            x++;
        }
        System.out.println("Merged Array:");
        for(int i=C.length-1; i>=0; i--){
            System.out.print(C[i]+" ");
        }
    }
}
