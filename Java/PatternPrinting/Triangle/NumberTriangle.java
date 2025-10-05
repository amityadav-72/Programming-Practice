package PatternPrinting.Triangle;
import java.util.Scanner;


public class NumberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i,j;

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//Enter the number : 4
//        1
//        1 2
//        1 2 3
//        1 2 3 4