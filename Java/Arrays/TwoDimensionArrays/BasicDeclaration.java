package Arrays.TwoDimensionArrays;

import java.util.Scanner;

public class BasicDeclaration {
    public static void main(String[] args) {
        int[][] arr =new int[2][3];
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){

                arr[i][j] = sc.nextInt();

            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
