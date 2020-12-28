public class AlmostPalindrome {
    public static boolean almostPalindrome(String str) {
        int length = str.length();
        char[] arr = str.toCharArray();
        int counter = 0;
        for(int i = 0;i<length/2;i++) {
            if(arr[i] != arr[length-1-i]) {
                counter +=1;
            }
        }
        return counter == 1;
    }
}
