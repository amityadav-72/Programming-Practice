package PatternPrinting.NumberSpiral;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {

        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k=num;

        for(int i=1; i<=2*num-1; i++){
            for(int j=1; j<=2*num-1; j++){
                int a=i;
                int b=j;
                if(i>num) a=2*num-i;
                if(j>num) b=2*num-j;
                System.out.print(num+1-Math.min(a,b)+ " ");

            }

            System.out.println();
        }

    }
}
