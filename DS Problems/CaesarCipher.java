import java.util.Scanner;
public class CaesarCipher {
    public static String encode(String s, int j)
    {
        //Using for loop to operate the shifting operation while excluding spaces
        for(int i=j++;i<s.length();i+=j){
            s = s.substring(0,i)+(char)(s.charAt(i)+2)+s.substring(i+1);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        System.out.println("Given String : "+s1);
        System.out.println("Enter the Shifting number:");
        int n=sc.nextInt();
        System.out.println("Shift by : "+n);
        //calling encode method
        encode(s1, n);
        System.out.println("After Converting:"+encode(s1,n));
    }
}
