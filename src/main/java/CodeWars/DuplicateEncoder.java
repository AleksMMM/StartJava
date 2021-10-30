package CodeWars;

import java.util.*;

/**
 * Цель этого упражнения - преобразовать строку в новую строку, где каждый символ в новой строке равен '(',
 * если этот символ появляется только один раз в исходной строке, или ')',
 * если этот символ встречается более одного раза в исходной строке.
 * Игнорируйте использование заглавных букв при определении дубликата символа.
 */
public class DuplicateEncoder {
    public static void main(String[] args) {
        String str = "dfsdfgdhghsdfseffbvb";
        System.out.println(encode(str));

    }

    static String encode(String word) {

        Map<Character, Integer> map = new HashMap<>();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(word.charAt(i))) {
                int value = map.get(word.charAt(i));
                map.remove(word.charAt(i));
                map.put(word.charAt(i), ++value);
            } else {
                map.put(word.charAt(i), 1);
            }
        }

        String output = "";

        for (int i = 0; i < word.length(); i++) {
            output += (map.get(word.charAt(i)) > 1) ? ")" : "(";
        }

        return output;
    }
}