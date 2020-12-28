import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberWordDecoder {
//    Create a program that converts a phone number with letters to one with only numbers.
    public static String textToNum(String phone) {
        Map<Character, Character> dictionary = new HashMap<Character, Character>();
        dictionary.put('A','2');
        dictionary.put('B','2');
        dictionary.put('C','2');
        dictionary.put('D','3');
        dictionary.put('E','3');
        dictionary.put('F','3');
        dictionary.put('G','4');
        dictionary.put('H','4');
        dictionary.put('I','4');
        dictionary.put('J','5');
        dictionary.put('K','5');
        dictionary.put('L','5');
        dictionary.put('M','6');
        dictionary.put('N','6');
        dictionary.put('O','6');
        dictionary.put('P','7');
        dictionary.put('Q','7');
        dictionary.put('R','7');
        dictionary.put('S','7');
        dictionary.put('T','8');
        dictionary.put('U','8');
        dictionary.put('V','8');
        dictionary.put('W','9');
        dictionary.put('X','9');
        dictionary.put('Y','9');
        dictionary.put('Z','9');
        char[] phoneNumber = phone.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i<phone.length();i++) {
            int x = Character.getNumericValue(phoneNumber[i]);
            if (x<=35 && x>=10) {
                list.add(dictionary.get(phoneNumber[i]));
            } else {
                list.add(phoneNumber[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : list) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
