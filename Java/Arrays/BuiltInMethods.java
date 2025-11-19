package Arrays;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {

        int[] arr = {30,10,40,23};

        Arrays.sort(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
