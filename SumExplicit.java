import java.util.Scanner;

public class SumExplicit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;
        System.out.println("Enter five number :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>9)
                sum+=arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
