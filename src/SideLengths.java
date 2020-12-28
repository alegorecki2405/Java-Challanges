public class SideLengths {
    //    Given the shortest side of a 30° by 60° by 90° triangle you have to find out the other 2
    //    sides, (return the longest side, medium-length side).
    //    rounded to 2 decimal places
    public static double[] otherSides(int n) {
        double longest = 2 * n;
        double medium = Math.floor(Math.sqrt(3) * n * 100) / 100;
        double[] result = {longest, medium};
        return result;
    }
}