public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        int maxIndex = 0;
        for(int i =1;i<X;i++) {
            for(int j=0;j<A.length;j++) {
                if(i==A[j] && j>maxIndex) {
                    maxIndex=j;
                }
            }
        }
        return maxIndex;
    }
}
