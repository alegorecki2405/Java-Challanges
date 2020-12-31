public class RecursionCountTheDigits {
//    Create a function that will recursively count the number of digits of a number. Conversion of
//    the number to a string is not allowed, thus, the approach is recursive.
    public static int digitsCount(long n) {
        if(n<0) {
            n=n*(-1);
        }
        if(n>=0 && n<=9) {
            return 1;
        } else {
            return digitsCount(n/10)+1;
        }
    }
}
