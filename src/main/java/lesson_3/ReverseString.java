package lesson_3;

import java.util.*;

public class ReverseString {

    public static String reverse(String string) {
        LinkedList<Character> characters = new LinkedList<>();
        Stack<Character> charList = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();
        for (Character c : chars) {
            charList.add(c);
        }
        while (!charList.empty()) {
            sb.append(charList.pop());
        }
        for (Character c : chars) {
            characters.push(c);
        }
        while (!characters.isEmpty()) {
            sb.append(characters.poll());
        }
//        for (int i = chars.length - 1; i > -1 ; i--) {  можно таким циклом например
//            sb.append(chars[i]);
//        }
//        for (int i = string.length() - 1; i > -1; i--) { или таким
//            sb.append(string.charAt(i));
//        }
        return sb.toString();
    }

}
