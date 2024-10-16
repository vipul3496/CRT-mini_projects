import java.util.Arrays;
import java.util.Scanner;

public class ListCombine {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int j=0;
        int arr[] = new int[5],arr2[] = new int[5],arr3[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            if((i%2)!=0){
                arr3[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<5;i++){
            arr2[i]=sc.nextInt();
            if((i%2)==0){
                arr3[j]=arr2[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
