package Arrays.ArrayList;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {

        ArrayList<Integer> arr =new ArrayList<>();
        System.out.println(arr + " " + arr.size());

        arr.add(10);
        System.out.println(arr + " " + arr.size());
        arr.add(20);
        System.out.println(arr + " " + arr.size());
        arr.add(30);
        System.out.println(arr + " " + arr.size());

        arr.remove(1);
        System.out.println(arr + " " + arr.size());
    }
}
