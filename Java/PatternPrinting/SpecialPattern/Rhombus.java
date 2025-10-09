package PatternPrinting.SpecialPattern;
import java.util.Scanner;



public class Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num =sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
}


//Enter the number of line: 4
//              * * * *
//            * * * *
//          * * * *
//        * * * *
