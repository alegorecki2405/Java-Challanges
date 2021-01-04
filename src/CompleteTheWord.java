import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompleteTheWord {
//    An input string can be completed if additional letters can be added and no letters need to be
//    taken away to match the word. Furthermore, the order of the letters in the input string must
//    be the same as the order of letters in the final word.Create a function that, given an input 
//    string, determines if the word can be completed.
    public static boolean canComplete(String initial, String word) {
        List<Character> arr = word.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
        List<Character> arr2 = new ArrayList<>(arr);
        int place;
        char[] init = initial.toCharArray();
        for (char c : init) {
            if(!arr.contains(c)){
                return false;
            } else {
                place = arr.indexOf(c);
                arr.remove(place);
                arr.add(place, ' ');
            }
        }
        int index = 0;
        for(int i=0;i<initial.length();i++) {
            if(arr2.indexOf(init[i])>=index) {
                index = arr2.indexOf(init[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}
