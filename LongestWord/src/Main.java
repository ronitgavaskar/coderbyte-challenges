import java.util.*;
import java.io.*;


/**
 *
 * Challenge
 * Have the function LongestWord(sen) take the sen
 * parameter being passed and return the largest word in the string.
 * If there are two or more words that are the same length, return
 *the first word from the string with that length. Ignore
 *punctuation and assume sen will not be empty.
 *
 * Sample Test Cases:
 *
 * Input:"fun&!! time"
 * Output:"time"
 *
 *
 * Input:"I love dogs"
 * Output:"love"
 *
 * Input: "a confusing /:sentence:/[ this is not!!!!!!!~"
 * Output: confusing
 *
 * Input: "coderbyte"
 * Output: coderbyte
 *
 * Input: "java "
 * Output: 12345
 *
 */

 import java.util.*;
 import java.io.*;

 class Main {
   public static String LongestWord(String sen) {

     // code goes here
     /* Note: In Java the return type of a function and the
        parameter types being passed are defined, so this return
        call must match the return type of the function.
        You are free to modify the return type. */
     sen = sen.replaceAll("[^a-zA-Z0-9\\s]+", "");
     HashMap<String, Integer> map = new HashMap<>();

     for (String word: sen.split(" ")) {
       map.put(word, word.length());
     }

     ArrayList<Integer> valueList = new ArrayList<Integer>(map.values());

     int max = Collections.max(valueList);

     for (int i = 0; i < sen.split(" ").length; i++){
       if (sen.split(" ")[i].length() == max) {
         return sen.split(" ")[i];
       }
     }

     return "";

   }

   public static void main (String[] args) {
     // keep this function call here
     Scanner s = new Scanner(System.in);
     System.out.print(LongestWord(s.nextLine()));
   }

 }
