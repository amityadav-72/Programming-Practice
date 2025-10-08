package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class StarInCrossShape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();

        int k =num+1;
        for(int i=1; i<=num; i++){
            int x= k-i;
            for(int j=1; j<=num; j++){
               if(j==i || j==x){
                   System.out.print("* ");
               }
               else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        sc.close();
    }
}


//Enter the number of line: 5
//        *       *
//          *   *
//            *
//          *   *
//        *       *