import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelFamilies {
//    Write a function that selects all words that have all the same vowels (in any order and/or
//    number) as the first word, including the first word.
    public static String[] sameVowelGroup(String[] words) {
        Set<Character> firstWord = getVowelsInWord(words[0]);
        List<String> matchingWords = new ArrayList<>();
        for(int i =0;i<words.length;i++) {
            if(getVowelsInWord(words[0]).equals(getVowelsInWord(words[i]))) {
                matchingWords.add(words[i]);
            }
        }
        String[] result = new String[matchingWords.size()];
        matchingWords.toArray(result);
        return result;
     }

    public static Set<Character> getVowelsInWord(String word) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        char[] arr = word.toCharArray();
        Set<Character> vowelsInWord = new HashSet<>();
        for(int i=0;i<word.length();i++) {
            if(vowels.contains(arr[i])) {
                vowelsInWord.add(arr[i]);
            }
        }
        return vowelsInWord;
    }
}
