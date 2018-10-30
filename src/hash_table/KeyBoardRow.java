package hash_table;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lycheeMao on 2018-10-30
 */
public class KeyBoardRow {
    public static void main(String[] args) {
        String[] wordsA = findWordsA(new String[]{"qsde", "asdhj", "xcfv"});
        for (String word : wordsA) {
            System.out.print(word+"  ");
        }
    }

    /**
     * Given a List of words, return the words that can be typed using letters of
     * alphabet on only one row's of American keyboard like the image below.
     */
    private static String[] findWordsA(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.matches("[QqWwEeRrTtYyUuIiOoPp]+|[AaSsDdFfGgHhJjKkLl]+|[ZzXxCcVvBbNnMm]+")) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
