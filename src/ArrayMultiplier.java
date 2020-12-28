public class ArrayMultiplier {
//    Create a function that takes an array as an argument and returns a new nested array
//    for each element in the original array. The nested array must be filled with the corresponding
//    element (string or number) in the original array and each nested array has the same amount
//    of elements as the original array.
    public static Object[][] multiply(Object[] items) {
        int  length = items.length;
        Object[][] result = new Object[length][length];
        for (int i = 0; i<length;i++) {
            for (int j = 0; j<length;j++) {
                result[i][j] = items[i];
            }
        }
        return result;
    }
}