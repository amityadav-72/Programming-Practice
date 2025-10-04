package PatternPrinting.Square;
import java.util.*;

public class StarRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter the Number of Columns");
        int col = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
