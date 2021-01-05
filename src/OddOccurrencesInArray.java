public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        for(int i=0;i<A.length;i++) {
            int count = 0;
            for(int j = 0;j<A.length;j++) {
                if(A[j] == A[i]) {
                    count+=1;
                    if(count==2) {
                        break;
                    }
                }
            }
            if(count==1) {
                return A[i];
            }
        }
        return -1;
    }
}
