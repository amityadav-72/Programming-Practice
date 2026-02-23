package Arrays.ArrayList.TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(a); arr.add(b); arr.add(c); arr.add(d);

        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }



    }
}
