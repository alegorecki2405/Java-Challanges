public class Persistence {
    //    The additive persistence of an integer, n, is the number of times you have to replace n with
//    the sum of its digits until n becomes a single digit integer.The multiplicative persistence of
//    an integer, n, is the number of times you have to replace n with the product of its digits until n
//    becomes a single digit integer.
    public static int additivePersistence(int n) {
        return reqPersistence(n,0);
    }

    public static int reqPersistence(int n,int count) {
        if(n>=10) {
            int sum = 0;
            while (true) {
                if (n<10) {
                    sum+=n;
                    break;
                } else {
                    sum += n%10;
                    n = n/10;
                }
            }
            count+=1;
            return reqPersistence(sum,count);
        } else {
            return count;
        }
    }

    public static long multiplicativePersistence(long n) {
        return reqMultiplicativePersistence(n,0);
    }

    public static long reqMultiplicativePersistence(long n,long count) {
        if(n>=10) {
            long sum = 1;
            while (true) {
                if (n<10) {
                    sum*=n;
                    break;
                } else {
                    sum *= n%10;
                    n = n/10;
                }
            }
            count+=1;
            return reqMultiplicativePersistence(sum,count);
        } else {
            return count;
        }
    }
}
