package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 10, 20 ,30, 40 ,50,60,70};
        int temp;
        int i=0, j=arr.length-1;

        for(int ele : arr){
            System.out.print(ele+ " ");
        }

        while(i<=j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

        System.out.println();
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
