package Arrays.LinearSearch;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements: ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=1; i<num; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value is: "+min);
        sc.close();

    }

}
