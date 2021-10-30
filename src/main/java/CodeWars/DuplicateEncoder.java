package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Цель этого упражнения - преобразовать строку в новую строку, где каждый символ в новой строке равен '(',
 * если этот символ появляется только один раз в исходной строке, или ')',
 * если этот символ встречается более одного раза в исходной строке.
 * Игнорируйте использование заглавных букв при определении дубликата символа.
 */
public class DuplicateEncoder {
    public static void main(String[] args) {
        String str = "dfsdfgdhghsdfseffbvb";
        encode(str);

    }

    static String encode(String word) {

        List<Character> characters = new ArrayList<>(word.charAt(0));

        for (int i = 0; i < characters.size(); i++) {
            char ch = characters.get(i);
            for (int j = 1; j < characters.size(); j++) {
                if (ch == characters.get(j)) {
                    characters.set(i, ')');
                }else {
                    characters.set(i, '(');
                }
            }
        }
        Character[] chr = (Character[]) characters.toArray();
        word = (String.valueOf(chr));

        return word;
    }
}