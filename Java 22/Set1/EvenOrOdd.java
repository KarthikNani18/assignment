package Set_1;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("it is a even Number");
        else
            System.out.println("it is a odd number");
    }
    
}
