public class HowManyPrimeNumbersAreThere {
    public static int primeNumbers(int num) {
        int counter = 0;
        for(int i = 0;i<num;i++) {
            if(isPrime(i)) {
                counter+=1;
            }
        }
        return counter;
    }

    public static boolean isPrime(int x) {
        if (x <=1 ) {
            return false;
        } else {
            for (int i = 2;i<x-1;i++) {
                if(x%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}
