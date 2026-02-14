package Arrays.TwoDimensionArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};

        int[][] transpose =new int[3][3];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                transpose[i][j]=arr1[j][i];
            }
        }

        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[i].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
