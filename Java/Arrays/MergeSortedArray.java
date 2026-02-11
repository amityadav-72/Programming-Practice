package Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1,3,4,7};
        int[] arr2 = {2,5,6,8};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr = new int[n1 + n2];

        int i = 0; // for merged array
        int j = 0; // for arr1
        int k = 0; // for arr2


        while (j < n1 && k < n2) {
            if (arr1[j] <= arr2[k]) {
                arr[i] = arr1[j];
                j++;
            } else {
                arr[i] = arr2[k];
                k++;
            }
            i++;
        }


        while (j < n1) {
            arr[i] = arr1[j];
            j++;
            i++;
        }

        while (k < n2) {
            arr[i] = arr2[k];
            k++;
            i++;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
