/**
 *
 * Challenge
 * Have the function TimeConvert(num) take the num parameter
 * being passed and return the number of hours and minutes the
 * parameter converts to (ie. if num = 63 then the output should
 * be 1:3). Separate the number of hours and minutes with a
 * colon.
 *
 * Sample Test Cases:
 *
 * Input: 63
 * Output: 1:3
 *
 * Input: 45
 * Output: 0:45
 */

 import java.util.*;
import java.io.*;

class Main {
  public static String TimeConvert(int num) {

    // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
    StringBuilder sb = new StringBuilder();
    sb.append(Integer.toString(num/60) + ":" + Integer.toString(num % 60));
    return sb.toString();

  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine()));
  }

}
