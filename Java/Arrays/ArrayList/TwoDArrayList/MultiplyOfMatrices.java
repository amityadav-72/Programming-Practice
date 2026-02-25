package Arrays.ArrayList.TwoDArrayList;

public class MultiplyOfMatrices {
    public static void main(String[] args) {
        int[][]  a = {{1,2,3},{4,5,6}};
        int[][]  b = {{1,2,3,4},{4,5,6,7}, {8,9,10,11}};

        if(a[0].length != b.length){
            System.out.println("Multiplication is not possible");
        }
        else{
            int[][] c = new int[a.length][b[0].length];

            for(int i=0; i<c.length; i++){
                for(int j=0; j<c[0].length; j++){

                    for(int k=0; k<b.length; k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
