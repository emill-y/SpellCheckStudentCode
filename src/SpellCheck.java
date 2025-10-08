import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Eisha Yadav
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text       The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
          LinkedHashSet<String> misspelledSet = new LinkedHashSet<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Would you like to use a Trie [type ('Trie')] or TST [type ('TST')]: \n ");
//        String algoChoice = scanner.nextLine();
        String algoChoice = "TST";
        if (algoChoice.equalsIgnoreCase("Trie")) {
            Trie trie = new Trie();
            for (String word : dictionary) {
                trie.insert(word);
            }
            for (String word : text) {
                if (!trie.contains(word)) {
                    misspelledSet.add(word);
                }
            }
        } else if (algoChoice.equalsIgnoreCase("TST")) {
            TST tst = new TST();
            for (String word : dictionary) {
                tst.insert(word);
            }
            for (String word : text) {
                if (!tst.contains(word)) {
                    misspelledSet.add(word);
                }
            }
        }
        else {
            System.out.println("Error: incorrect input. ");
        }

        String[] misspelledArray = new String[misspelledSet.size()];
        misspelledSet.toArray(misspelledArray);
        return misspelledArray;

    }
}
