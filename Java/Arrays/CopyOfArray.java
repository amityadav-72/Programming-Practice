package Arrays;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23};

        Arrays.sort(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }

        System.out.println();

        int[] nums =arr; // shallow copy

        for(int ele: nums){
            System.out.print(ele+" ");
        }

        int[] brr = Arrays.copyOf(arr, arr.length);// deep copy

        for(int ele: brr){
            System.out.print(ele+" ");
        }
    }
}
