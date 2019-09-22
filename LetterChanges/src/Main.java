import java.util.*;
import java.io.*;


/**
 *
 * Challenge
 * Have the function LetterChanges(str) take the
 * str parameter being passed and modify it using
 * the following algorithm. Replace every letter in
 * the string with the letter following it in the alphabet
 * (ie. c becomes d, z becomes a). Then capitalize every vowel in this new
 * string (a, e, i, o, u) and finally return this modified string.
 *
 * Sample Test Cases:
 *
 * Input:"hello*3"
 * Output:"Ifmmp*3"
 *
 *
 * Input:"fun times!"
 * Output:"gvO Ujnft!"
 *
 *
 */


 class Main {
   public static String LetterChanges(String str) {

     // code goes here
     /* Note: In Java the return type of a function and the
        parameter types being passed are defined, so this return
        call must match the return type of the function.
        You are free to modify the return type. */
     StringBuilder sb = new StringBuilder();

     for (char c: str.toCharArray()) {
       int val = (int) c;
       if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
         if (val == 122) {
           sb.append('a');
         }
         if (val == 90) {
           sb.append('A');
         }
         sb.append((char)(val + 1));
       } else {
         sb.append(c);
       }
     }

     str = sb.toString();
     sb = new StringBuilder();
     for (char c: str.toCharArray()) {
       if ((int)c == 97 || (int)c == 101 || (int)c == 105 || (int)c == 111 || (int)c == 117) {
         sb.append((char)((int)c - 32));
       } else {
         sb.append(c);
       }
     }

     return sb.toString();
   }

   public static void main (String[] args) {
     // keep this function call here
     Scanner s = new Scanner(System.in);
     System.out.println(LetterChanges(s.nextLine()));
   }

 }
