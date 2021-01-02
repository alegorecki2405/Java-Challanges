import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicPigLatinTranslation {
//    Create a function that takes a string of words and moves the first letter of each word to the
//    end of it, then adds "ay" to the end of the word. This is called "Pig Latin" and it gets more
//    complicated than the rules in this particular challenge. I've intentionally kept things simple,
//    otherwise this would turn into an extremely tedious challenge.
//
//    Move the first letter of each word to the end of the word.
//    Add "ay" to the end of the word.
//    Words starting with a vowel (A, E, I, O, U) simply have "WAY" appended to the end.
    public static String pigLatin(String str) {
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a','e','i','o','u'));
        String last = String.valueOf(str.charAt(str.length()-1));
        String[] arr = str.substring(0,str.length()-1).toLowerCase().split(" ");
        String result = "";
        String modified ;
        for(int i = 0; i<arr.length;i++) {
            if (vowels.contains(arr[i].charAt(0))) {
                modified = arr[i].concat("way");
            } else {
                modified = arr[i].substring(1)
                        .concat(String.valueOf(arr[i].charAt(0)))
                        .concat("ay");
            }
            if (i == arr.length-1) {
                result = result.concat(modified);
            } else {
                result = result.concat(modified).concat(" ");
            }
        }
        return result.substring(0,1).toUpperCase() + result.substring(1) + last;
    }
}

