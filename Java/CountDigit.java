import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count=0;

        for(int i=0; i<number; i++){

            count = 0;

            int temp = number;

            while(temp!=0){

                temp /= 10;

                count++;
            }


        }
        System.out.println("The number of Digit in "+ number + " is " +count);
    }
}
