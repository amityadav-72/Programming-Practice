package PatternPrinting.Triangle;
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Enter the number of line: ");
        int num =sc.nextInt();

        for(i=1; i<=num; i++){
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}



//Enter the number of line: 4
//        *
//        * *
//        * * *
//        * * * *
