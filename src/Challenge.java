import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge {
//    Create a function that determines whether elements in an array can be re-arranged to form
//    a consecutive list of numbers where each number appears exactly once.
    public static boolean cons(int[] arr) {
        int length = arr.length;
        for(int i = 0; i<length-1;i++) {
            for(int j = i+1;j<length;j++){
                if(arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for (int i : arr) {
            list.add(i);
        }
        Collections.sort(list);
        for(int i = 0;i<length-1;i++) {
            if(list.get(i)+1 != list.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}