/**
 *
 * Challenge
 * Have the function AlphabetSoup(str) take the str string
 * parameter being passed and return the string with the letters
 * in alphabetical order (ie. hello becomes ehllo). Assume
 * numbers and punctuation symbols will not be included in the
 * string.
 *
 * Sample Test Cases:
 *
 * Input: "hello"
 * Output: "ehllo"
 *
 * Input: "hooplah"
 * Output: "ahhloop"
 */

 import java.util.*;
import java.io.*;

class Main {
  public static String AlphabetSoup(String str) {

    // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
    ArrayList<Integer> list = new ArrayList<>();
    for (char c: str.toCharArray()) {
      list.add((int) c);
    }
    Collections.sort(list);

    StringBuilder sb = new StringBuilder();
    for (int asciiVal: list) {
      sb.append((char) asciiVal);
    }
    return sb.toString();

  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine()));
  }

}
