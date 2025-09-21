import java.util.Scanner;

public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value of a ");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of common difference");
        int d = sc.nextInt();

        System.out.print("Enter the Number of terms want to print");
        int n = sc.nextInt();

      for(int i=0; i<n; i++){
        int term = a+i*d;

        System.out.print(term + " ");

      }

 sc.close();
    }
}
