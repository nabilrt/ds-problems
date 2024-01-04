import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        int id[]=new int[10];
        int creditsc[]=new int[10];
        double cg[]=new double[10];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Students Records: \n");
        System.out.print("\n");
        for (int i = 0;i < 10;i++)
        {
            System.out.print("Enter Student Record ");
            System.out.print(i + 1);
            System.out.println();
            //using the boolean variable to check if the id is unique or not
            boolean isUnique = true;
            //while loop to operate the uniqueness of the id
            while (isUnique)
            {
                System.out.print("Enter Student ID: ");
                id[i] = input.nextInt();
                isUnique = false;
                for (int j = 0;j < i;j++)
                {
                    if (id[j] == id[i])
                    {
                        System.out.print("This ID is already exist...Try Again");
                        System.out.print("\n");
                        //If the id is not unique the loop will break and user will have to input again
                        isUnique = true;
                        break;
                    }
                }
            }
            System.out.print("Enter Student Credits: ");
            creditsc[i] = input.nextInt();
            System.out.print("Enter Student CGPA: ");
            cg[i] = input.nextDouble();
            System.out.print("\n");
        }

        System.out.print("Printing all the student's ID whose CGPA is more than 3.75 : \n");
        System.out.print("\n");
        for (int i = 0;i < 10;i++)
        {
            //Printing the ID's Whose CGPA is more than 3.75
            if (cg[i] > 3.75)
            {
                System.out.print(id[i]);
                System.out.print("\n");
            }
        }
        System.out.print("\nPrinting all the student's ID who has completed more than 50 credits : \n");
        System.out.print("\n");
        for (int i = 0;i < 10;i++)
        {
            //Printing the ID's Whose completed more than 50 credits
            if (creditsc[i] > 50)
            {
                System.out.print(id[i]);
                System.out.print("\n");
            }
        }
    }
}
