package PatternPrinting.Square;
import java.util.Scanner;

public class SmallAlphaSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        for(int i =0; i<num; i++){
            for(int j=1;j<=num; j++){
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//
//Enter a number: 3
//a b c
//a b c
//a b c