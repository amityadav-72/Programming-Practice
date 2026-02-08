package Arrays;

public class ArrayQuestion1 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, -1, 12, 8, 5, 10};
        int x =18;
         for(int i=0; i<arr.length; i++){
             int val = x-arr[i];
             for(int j=i+1; j<arr.length; j++){
                 if(val==arr[j]){
                     System.out.println("The value is:" + i + " and "+  j);
                 }
             }
         }
    }
}
