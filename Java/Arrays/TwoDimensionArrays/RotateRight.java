package Arrays.TwoDimensionArrays;

public class RotateRight {
    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};

        // Transpose of matrix
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
            System.out.println();
        }
        print(arr1);


        // Reverse

        for(int i=0; i<arr1.length; i++){
            int a=0;
            int b=arr1.length-1;
            while(a<b){
                int temp = arr1[i][a];
                arr1[i][a]=arr1[i][b];
                arr1[i][b]=temp;
                a++;b--;
            }
        }
        print(arr1);


    }
}
