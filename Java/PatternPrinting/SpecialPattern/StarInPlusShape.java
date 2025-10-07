package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class StarInPlusShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();
        int k= (num+1)/2;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==k|| j==k){
                    System.out.print("* ");
                }

                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


//Enter the number of line: 5
//            *
//            *
//        * * * * *
//            *
//            *
