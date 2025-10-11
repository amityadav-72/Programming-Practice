package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();

        for(int i=1; i<=num*2-1; i++){
            System.out.print("* ");
        }
        System.out.println();

         for(int i =1; i<=num; i++){
             for(int j=1; j<=num-i; j++){
                 System.out.print("* ");
             }

             for(int j=1; j<=2*i-1; j++){
                 System.out.print("  ");
             }

             for(int j=1; j<=num-i; j++){
                 System.out.print("* ");
             }


             System.out.println();
         }
         sc.close();
    }
}


//Enter the number of line: 5
//        * * * * * * * * *
//        * * * *   * * * *
//        * * *       * * *
//        * *           * *
//        *               *
//