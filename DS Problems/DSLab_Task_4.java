import java.util.Scanner;
public class DSLab_Task_4 {
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
        boolean CommonFound=false;
        int count=0;
        int C[]=new int[n];
        int x=0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i]==B[j]){
                    C[x]=A[i];
                    x++;
                    CommonFound=true;
                    count++;
                    break;
                }
            }
        }
        if(CommonFound){
            System.out.print("Common Elements between these two arrays are:");
            for(int l=0; l<count; l++){
                System.out.print(C[l]+" ");
            }
        }
        else{
            System.out.println("No Common Element Found");
        }
    }
}
