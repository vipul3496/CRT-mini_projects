import java.util.Scanner;

class Validate{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter a Password :");
        str = sc.nextLine();
        boolean capital=false,small=false,special=false,number=false;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=91)
                capital=true;
            else if(str.charAt(i)>=97 && str.charAt(i)<=121)
                small=true;
            else if(str.charAt(i)>='0' && str.charAt(i)<='9')
                number=true;
            else if(str.charAt(i)!= ' ')
                special=true;
        }
        if(capital&&small&&special&&number)
            System.out.println("password is valid");
        else
            System.out.println("Password is invalide");

    }
}