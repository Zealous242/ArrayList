import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = {1,2,3,4};
        ArrayList<Integer> myList = new ArrayList<Integer>(); // Have to use wrapper class

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(0, 4);
        myList.add(2, 5);
        Collections.sort(myList);

        for(int i = 0; i < myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
