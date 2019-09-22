import java.util.*;
import java.io.*;


/**
 *
 * Challenge
 * Have the function SimpleSymbols(str) take the str parameter
 * being passed and determine if it is an acceptable sequence by
 * either returning the string true or false. The str parameter
 * will be composed of + and = symbols with several characters
 *between them (ie. ++d+===+c++==a) and for the string to be
 * true each letter must be surrounded by a + symbol. So the string
 * to the left would be false. The string will not be empty and
 * will have at least one letter.
 *
 * Sample Test Cases:
 *
 * Input:"+d+=3=+s+"
 * Output:true
 *
 * Input:"f++d+"
 * Output:false
 */
import java.util.*;
import java.io.*;

class Main {
  public static String SimpleSymbols(String str) {

    // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

    // Get list of indices of all letters
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      //65 90 97 122
      if (((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 97) || ((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122)) {
        if (i == 0 || i == str.length() - 1) {
          return "false";
        }
        set.add(i);
      }
    }
    for (int index: set) {
      if (str.charAt(index - 1) != '+' || str.charAt(index + 1) != '+') {
        return "false";
      }
    }

    return "true";

  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine()));
  }
}
