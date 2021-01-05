public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        float distance = Y-X;
        float result = distance/D;
        return (int) Math.ceil((double)distance/D);
    }
}
