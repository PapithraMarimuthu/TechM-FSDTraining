package Task_1;
import java.util.Arrays;
import java.util.stream.Collectors;
//12. String Handling
class StringProcessor {
 // Method to reverse a string
 public static String reverseString(String str) {
     return new StringBuilder(str).reverse().toString();
 }
 
 // Method to count occurrences of a substring in a string
 public static int countOccurrences(String text, String sub) {
     return text.split(sub, -1).length - 1; // Split the string by substring and count occurrences
 }
 
 // Method to split a string and capitalize each word
 public static String splitAndCapitalize(String str) {
     return Arrays.stream(str.split(" "))
             .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1)) // Capitalize first letter of each word
             .collect(Collectors.joining(" ")); // Join words back into a string
 }
}

