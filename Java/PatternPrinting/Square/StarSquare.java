package PatternPrinting.Square;
import java.util.*;

public class StarSquare {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Sqaure you want: ");
        int side = sc.nextInt();

        for(int i =1; i<=side; i++){
            for(int j =1; j<=side; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}



/* Enter the Size of Sqaure you want: 4
        * * * *
        * * * *
        * * * *
        * * * *
*/