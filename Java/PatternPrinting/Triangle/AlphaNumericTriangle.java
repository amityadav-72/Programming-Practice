package PatternPrinting.Triangle;

import java.util.Scanner;

public class AlphaNumericTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number for Triangle: ");
        int num =sc.nextInt();

        for(int i =1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    System.out.print((char)(j+64) + " ");
                  }
                else{
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}




//Enter the Number for Triangle: 4
//1
//A B
//1 2 3
//A B C D