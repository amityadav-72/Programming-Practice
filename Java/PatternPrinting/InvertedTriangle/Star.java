package PatternPrinting.InvertedTriangle;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

         System.out.print("Enter the number of line : ");
         int num = sc.nextInt();

         for(int i=1; i<=num; i++){
             for(int j=num; j>=i; j--){
                 System.out.print("* ");
             }
             System.out.println();
         }
         sc.close();
    }
}

//
//Enter the number of line : 4
//        * * * *
//        * * *
//        * *
//        *