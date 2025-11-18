package Arrays.LinearSearch;
import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        boolean found = false;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==x){
               found = true;
               break;
           }
       }

       if(found == true){
           System.out.println("element found");
       }
       else{
           System.out.println("element not found");
       }
       sc.close();

    }
}
