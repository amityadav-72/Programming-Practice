package PatternPrinting.Square;

import java.util.Scanner;

public class AlphaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last Alphabet: ");
        int last = sc.nextInt();

        for(int i=1; i<=last; i++){
            for(int j= 1; j<=last; j++) {
                System.out.print((char)(j+64) + " "); // Type Casting Ascii value of A = 65
            }
            System.out.println();
        }
        sc.close();
    }
}
