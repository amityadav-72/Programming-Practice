package Arrays;

import java.util.Scanner;

public class InputOfArray {

    public static  void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input

        for(int i=0; i<5; i++){
            arr[i] =sc.nextInt();
        }

        // Output

        for(int i =0; i<5; i++){
            System.out.print(arr[i]+ " ");
        }


        System.out.println("Second Array direct with curly bracket: ");

        int[] arr1 = {1,2,3,4,5};

        for(int i=0; i<5; i++){
            System.out.print(arr1[i]+ " ");
        }

    }
}
