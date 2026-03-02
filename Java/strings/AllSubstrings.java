package strings;
import java.util.*;

public class AllSubstrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =sc.nextLine();

        for(int i=0; i<=str.length(); i++){
            for(int j=i; j<=str.length(); j++){
                System.out.print(str.substring(i,j)+ " ");
            }
            System.out.println();

        }

    }
}
