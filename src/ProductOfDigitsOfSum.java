import java.util.Arrays;

public class ProductOfDigitsOfSum {
    //    Create a function that takes numbers as arguments, adds them together, and returns the
    //    product of digits until the answer is only 1 digit long.
    public static long sumDigProd(long... nums) {
        long sum = Arrays.stream(nums).sum();
        return multiplication(sum);
    }

    public static long multiplication(long sum) {
        long result = 1;
        while (true) {
            result*=sum%10;
            sum=sum/10;
            if(sum==0){
                break;
            }
        }
        if(result>9) {
            return multiplication(result);
        } else {
            return result;
        }
    }
}
