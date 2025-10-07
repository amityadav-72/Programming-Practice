package PatternPrinting.InvertedTriangle;
import java.util.Scanner;

public class NumberTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for line:");
        int num = sc.nextInt();

        for(int i =1; i<=num; i++){
            for(int j=1; j<=num+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//
//Enter the number for line:4
//        1 2 3 4
//        1 2 3
//        1 2
//        1