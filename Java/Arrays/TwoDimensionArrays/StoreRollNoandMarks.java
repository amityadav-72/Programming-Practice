package Arrays.TwoDimensionArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StoreRollNoandMarks {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            System.out.print("Enter the roll & Marks: ");
            for(int j=0; j<2; j++){

                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
