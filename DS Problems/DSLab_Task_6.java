import java.util.Scanner;
public class DSLab_Task_6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        int count = 0;
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int A[]=new int[n];
        int F[]=new int[n];
        System.out.print("Enter the array elements:");
        for(i=0; i<n; i++){
            A[i]=sc.nextInt();
            F[i]=0;
        }
        for(i=0; i<n; i++){
            count=1;
            for(j=i+1; j<n; j++){
                if(A[i]==A[j]){
                    count++;
                    F[j]=-1;
                }
            }
            if(F[i]==0){
                F[i]=count;
            }
        }
        System.out.println("Frequencies:");
        for(i=0; i<n; i++){
            if(F[i]!=-1){
                System.out.println("The number "+A[i]+" is found "+F[i]+" times");
            }
        }

    }
}
