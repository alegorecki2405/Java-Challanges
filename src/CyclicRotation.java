import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {
    public static void solution(int[] A,int K) {
        List arr = new ArrayList();
        for(int i =0;i<A.length;i++) {
            arr.add(A[i]);
        }
        int element;
        for(int i=0;i<K;i++) {
            element = (Integer) arr.remove(arr.size()-1);
            arr.add(0,element);
        }
        System.out.println(arr);
    }
}
