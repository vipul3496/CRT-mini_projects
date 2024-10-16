import java.util.Scanner;

public class DecodLogic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Two number :");
        int sum=0,n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if((n1*n2)>500)
            System.out.println("Sum = " + n1+n2);
        else
            System.out.println("Hello LNB code is running Fine");

    }
}
