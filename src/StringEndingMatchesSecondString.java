public class StringEndingMatchesSecondString {
//    Create a function that takes two strings and returns true if the first string ends with the
//    second string; otherwise return false.
    public static boolean checkEnding(String str1, String str2) {
        String str = str1.substring(str1.length()-str2.length());
        return str.equals(str2);
    }
}
