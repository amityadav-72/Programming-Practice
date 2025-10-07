package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class OddNumberTraingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
//                if(j%2==0){
//                    System.out.print(2*j-1+" ");
//                }
//                else {
//                    System.out.print(2*j-1+ " ");
//                }
                System.out.print(2*j-1+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//Enter the number of line: 4
//        1
//        1 3
//        1 3 5
//        1 3 5 7

