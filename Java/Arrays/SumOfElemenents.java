package Arrays;

import java.util.Scanner;

public class SumOfElemenents {

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int n =sc.nextInt();

        int[] arr =new int[n];
        System.out.println("Enter the Elements of Array: ");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }

        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }

        System.out.println("Sum of Elements of Array: ");
        System.out.println(sum);

    }
}
