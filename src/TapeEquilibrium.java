import java.util.ArrayList;
import java.util.List;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int splitPlaces = A.length - 1;
        int min;
        int sum1 = 0;
        int sum2 = 0;
        List<Integer> minimum = new ArrayList<>();
        for (int i = 1; i <= splitPlaces; i++) {
            for (int x = 0; x < i; x++) {
                sum1 += A[x];
            }
            for (int y = i; y < A.length; y++) {
                sum2 += A[y];
            }
            min = sum1 - sum2;
            if (min < 0) {
                min *= -1;
            }
            sum1 = 0;
            sum2 = 0;
            minimum.add(min);
        }
        min = minimum.get(0);
        for(int i =0;i<minimum.size();i++) {
            if(minimum.get(i)<min) {
                min=minimum.get(i);
            }
        }
        return min;
    }
}
