public class UnmixMyStrings {
//    lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say: Please help me unmix
//    these strings! Somehow my strings have all become mixed up; every pair of characters has been swapped.
//    Help me undo this so I can understand my strings again.
    public static String unmix(String str) {
        char[] arr = str.toCharArray();
        int len;
        char[] arr2 = new char[str.length()];
        if(str.length()%2==0){
            len = str.length();
        } else {
            len = str.length()-1;
            arr2[str.length()-1] = arr[str.length()-1];
        }
        for(int i=0;i<len;i+=2) {
            arr2[i] = arr[i+1];
            arr2[i+1] = arr[i];
        }
        String result = new String(arr2);
        return result;
    }
}
