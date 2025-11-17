package Arrays;

import java.util.Scanner;

// Q. Given an array of marks of students, if the marks is less than 35 print its roll no. [roll no. is the index of the array]
public class ArrayQ1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number of Students : ");
        int n =sc.nextInt();

        int[] arr = new int[n];

        System.out.println(" Enter the marks of Students : ");

        for(int i =0; i<arr.length; i++){
            arr[i] =sc.nextInt();

        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }
    }
}
