package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class NumberPatternPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

//
//Enter the number of line: 4
//              1
//            1 2 1
//          1 2 3 2 1
//        1 2 3 4 3 2 1
