import java.util.Scanner;

public class StrLen {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        if(str.length()>7){
            for(int i=0;i<str.length();i+=2)
                System.out.println(str.charAt(i));
        }
        else{
            for(int i=1;i<str.length();i+=2)
                System.out.println(str.charAt(i));
        }
    }
}
