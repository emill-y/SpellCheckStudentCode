import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

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
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        HashSet<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }

        LinkedHashSet<String> mispelledHash = new LinkedHashSet<>();

        for (String word : text) {
            if (!dictSet.contains(word)) {
                mispelledHash.add(word);
            }
        }

        String[] mispelledArr = new String[mispelledHash.size()];
        mispelledHash.toArray(mispelledArr);

        return mispelledArr;
//        ArrayList<String> mispelled = new ArrayList<>();
//        LinkedHashSet<String> mispelledHash = new LinkedHashSet<>();
//        for (String word : text) {
//            if (binarySearch(word, dictionary) == false) {
//                if (!mispelledHash.contains(word)) {
//                    mispelledHash.add(word);
//                }
//            }
//        }
//
//        String[] mispelledArr = new String[mispelledHash.size()];
//        mispelledHash.toArray(mispelledArr);
//
//        return mispelledArr;
    }
    // Iterative Implementation of Binary Search (Not Recursive)
//    public boolean binarySearch(String target, String[] dictionary){
//        int left = 0;
//        int right = dictionary.length - 1;
//
//        while (left <= right){
//            int mid = left + (right - left) / 2;
//            // Utilize CompareTo Value to see if strings are equal,
//            // if not, move in the correct direction of the dictionary (i.e to the left or right)
//            int comparison = dictionary[mid].compareTo(target);
//            if (comparison == 0){
//                // Return true if element found in Dictionary
//                return true;
//            }
//            if (comparison < 0) {
//                left = mid + 1;
//            }
//            else {
//                right = mid - 1;
//            }
//        }
//        return false;
//    }


}
