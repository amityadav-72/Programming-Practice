package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();
        int k=1;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                k = k+1;
            }

            System.out.println();

        }
        sc.close();
    }
}


//Enter the number of line: 6
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21