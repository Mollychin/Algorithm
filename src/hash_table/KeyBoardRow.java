package hash_table;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author lycheeMao on 2018-10-30
 */
public class KeyBoardRow {
    public static void main(String[] args) {
        String[] wordsA = findWordsC(new String[]{"qsde", "asdhj", "xcfv"});
        for (String word : wordsA) {
            System.out.print(word + "  ");
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

    private static String[] findWordsB(String[] words) {
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*[asdfghjkl]*[zxcvbnm]*")).
                toArray(String[]::new);
    }

    private static String[] findWordsC(String[] words) {
        Set<Character> rowA = new HashSet<>();
        rowA.add('q');
        rowA.add('w');
        rowA.add('e');
        rowA.add('r');
        rowA.add('t');
        rowA.add('y');
        rowA.add('u');
        rowA.add('i');
        rowA.add('o');
        rowA.add('p');
        Set<Character> rowB = new HashSet<>();
        rowA.add('a');
        rowA.add('s');
        rowA.add('d');
        rowA.add('f');
        rowA.add('g');
        rowA.add('h');
        rowA.add('j');
        rowA.add('k');
        rowA.add('l');
        Set<Character> rowC = new HashSet<>();
        rowA.add('z');
        rowA.add('x');
        rowA.add('c');
        rowA.add('v');
        rowA.add('b');
        rowA.add('n');
        rowA.add('m');

        int countNum = 0;
        List<String> result = new ArrayList<>();
        for (String word:words){
            word = word.toLowerCase();
            boolean canBeTyped = true;
            char c = word.charAt(0);
            Set<Character> row;
            if (rowA.contains(c)){
                row = rowA;
            }else if (rowB.contains(c)){
                row = rowB;
            }else{
                row =rowC;
            }
            for (int i = 0;i<word.length();i++){
                if (!row.contains(word.charAt(i))){
                    canBeTyped = false;
                    break;
                }
            }
            if (canBeTyped){
                result.add(words[countNum]);
            }
            countNum ++;
        }
        // list 转成 String类型的数组。
        String[] resultArray = result.toArray(new String[0]);

        return resultArray;

    }

}
