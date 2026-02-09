package Arrays;

public class ReverseArraybyK {
   static void reverse(int[] nums,int i, int j  ){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {


        int [] arr = {10,20,30,40,50,60,70};
        int k =3;
        int n = arr.length;
        int temp;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
