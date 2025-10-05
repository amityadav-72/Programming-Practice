package PatternPrinting.Triangle;

import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//Enter the number of line: 4
//A
//A B
//A B C
//A B C D