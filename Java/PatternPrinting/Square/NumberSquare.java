package PatternPrinting.Square;
import java.util.*;
public class NumberSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Square which you want to print");
        int number = sc.nextInt();


        for(int i=1; i<=number; i++){
        for(int j= 1; j<=number; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        }
        sc.close();
    }
}
