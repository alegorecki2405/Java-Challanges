public class DifferenceCipher {
    //    It's time to send and receive secret messages.Create two functions that take a string and an
//    array and returns a coded or decoded message.The first letter of the string, or the first
//    element of the array represents the Character Code of that letter. The next elements are
//    differences between the characters: e.g. A +3 --> C or z -1 --> y.
    public static int[] encrypt(String str) {
        int x = str.charAt(0);
        int[] arr = new int[str.length()];
        for(int i = 0;i<str.length();i++) {
            arr[i] = str.charAt(i);
        }
        int[] arr2 = new int[str.length()];
        arr2[0] = arr[0];
        for(int i = 1;i<str.length();i++) {
            arr2[i] = arr[i]-arr[i-1];
        }
        return arr2;
    }

    public static String decrypt(int[] arr) {
        int[] arr1 = new int[arr.length];
        arr1[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            arr1[i] = arr1[i-1]+arr[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++) {
            sb.append((char)arr1[i]);
        }
        return sb.toString();
    }
}
