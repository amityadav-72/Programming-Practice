package PatternPrinting.Bridge;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = sc.nextInt();

        for(int i=1; i<=num*2-1; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i =1; i<=num; i++){
            int a=1;
            for(int j=1; j<=num-i; j++){
                System.out.print(a++ + " ");

            }

            for(int j=1; j<=2*i-1; j++){
                System.out.print("  ");
                a++;
            }


            for(int j=1; j<=num-i; j++){
                System.out.print(a++  + " ");
            }


            System.out.println();
        }
        sc.close();
    }
}
