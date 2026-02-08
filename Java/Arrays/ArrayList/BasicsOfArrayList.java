package Arrays.ArrayList;
import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        arr.add(6);
        arr.add(7,80);

        System.out.println(arr.get(0));
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println(arr);
    }
}
