public class DSLab_Task_1 {
    public static void main(String[] args) {
        int A[]=new int[6];
        A[5]=600;
        A[3]=200;
        for(int i=0; i<A.length; i++){
            if(i>0){
                System.out.print(" , ");
            }
            System.out.print(A[i]);
        }
    }
}
