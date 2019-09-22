import java.util.*;
import java.io.*;


/**
 *
 * Challenge
 * Have the function FirstReverse(str) take the str parameter being
 * passed and return the string in reversed order. For example: if the
 * input string is "Hello World and Coders" then your program should
 * return the string sredoC dna dlroW olleH.
 *
 * Sample Test Cases:
 *
 * Input:"coderbyte"
 * Output:"etybredoc"
 *
 *
 * Input:"I Love Code"
 * Output:"edoC evoL I"
 *
 *
 */


class Main {
    public static String FirstReverse(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}