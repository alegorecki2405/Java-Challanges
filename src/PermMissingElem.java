import java.util.ArrayList;
import java.util.List;

public class PermMissingElem {
    public static int solution(int[] A) {
        List arr = new ArrayList();
        for (int a : A) {
            arr.add(a);
        }
        for (int i=1;i<=A.length+1;i++) {
            if(!arr.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
