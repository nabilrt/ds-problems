import java.util.Scanner;

public class Matrix_Transpose {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[3][4];
        int arrtrans[][]=new int[4][3];
        System.out.println("Enter the Elements:");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j]=input.nextInt();
            }
        }
        //Printing the non-transposed matrix
        System.out.println("Non-Transposed Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Storing the row values into columns and column values into rows
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arrtrans[j][i]=arr[i][j];
            }
        }
        //Printing the Transposed Matrix
        System.out.println("Transposed Matrix:");
        for(int j=0; j<4; j++){
            for(int i=0; i<3; i++){
                System.out.print(arrtrans[j][i]+" ");
            }
            System.out.println();
        }
    }
}



