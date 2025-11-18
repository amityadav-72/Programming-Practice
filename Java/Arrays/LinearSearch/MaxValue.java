package Arrays.LinearSearch;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements: ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=1; i<num; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            // max = Math.max(arr[i], max); // Alternative of if method
        }

        System.out.println("The maximum value is: "+max);
        sc.close();
    }
}
