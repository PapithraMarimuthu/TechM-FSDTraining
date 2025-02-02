package Task_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//13. Finding All Anagrams in a String
class AnagramFinder {
 // Method to find all starting indices of anagrams of string 'p' in string 's'
 public static List<Integer> findAnagrams(String s, String p) {
     List<Integer> result = new ArrayList<>();
     int[] pCount = new int[26], sCount = new int[26];
     for (char c : p.toCharArray()) pCount[c - 'a']++; // Count characters in 'p'
     for (int i = 0; i < s.length(); i++) {
         sCount[s.charAt(i) - 'a']++; // Count characters in 's'
         if (i >= p.length()) sCount[s.charAt(i - p.length()) - 'a']--; // Remove character that goes out of the window
         if (Arrays.equals(pCount, sCount)) result.add(i - p.length() + 1); // Check if counts match and add index to result
     }
     return result; // Return the list of anagram starting indices
 }
}
