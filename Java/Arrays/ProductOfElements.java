package Arrays;
import java.util.Scanner;


public class ProductOfElements {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements : ");

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();

        }

        int prod=1;

        for(int i=0; i<arr.length; i++){
            prod=prod*arr[i];
        }

        System.out.println("Product of Elements of Array: "+prod);

    }
}
