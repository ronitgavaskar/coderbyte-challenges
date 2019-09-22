import java.util.*;
import java.io.*;


/**
 *
 * Challenge
 * Have the function LetterCapitalize(str) take the str parameter being
 * passed and capitalize the first letter of each word. Words will be
 * separated by only one space.
 *
 * Sample Test Cases:
 *
 * Input:"hello world"
 * Output:"Hello World"
 *
 *
 * Input:"i ran there"
 * Output:"I Ran There"
 *
 * Input:"thisiscool"
 * Output:"Thisiscool"
 *
 * Input:"13455"
 * Output:"13455"
 */

 import java.util.*;
 import java.io.*;

 class Main {
   public static String LetterCapitalize(String str) {

     // code goes here
     /* Note: In Java the return type of a function and the
        parameter types being passed are defined, so this return
        call must match the return type of the function.
        You are free to modify the return type. */
     String[] arr = str.split(" ");
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < arr.length; i++) {
       sb.append(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ");
     }

     return sb.toString().trim();

   }

   public static void main (String[] args) {
     // keep this function call here
     Scanner s = new Scanner(System.in);
     System.out.print(LetterCapitalize(s.nextLine()));
   }

 }
