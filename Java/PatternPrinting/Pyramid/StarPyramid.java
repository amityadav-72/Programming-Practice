package PatternPrinting.Pyramid;
import java.util.Scanner;

public class StarPyramid {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        int nsp=num-1;
        int nst =1;

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=nsp; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst=nst+2;
            System.out.println();



        }

        nsp=1;
        nst=nst-4;
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=nsp; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst=nst-2;
            System.out.println();
        }



    }
}
