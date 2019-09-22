import java.util.*;
import java.io.*;


/**
 *
 * Challenge
 * Have the function SimpleAdding(num) add up all the numbers
 * from 1 to num. For example: if the input is 4 then your program should
 * return 10 because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter
 * num will be any number from 1 to 1000.
 *
 * Sample Test Cases:
 *
 * Input:12
 * Output:78
 *
 * Input:140
 * Output:9870
 *
 * Input: 2
 * Output: 3
 *
 * Input: 156
 * Output: 12246
 *
 * Input: 9
 * Output: 45
 */
 import java.util.*;
 import java.io.*;

 class Main {
   public static int SimpleAdding(int num) {

     // code goes here
     /* Note: In Java the return type of a function and the
        parameter types being passed are defined, so this return
        call must match the return type of the function.
        You are free to modify the return type. */
     int ret = 0;
     for (int i = 1; i <= num; i++) {
       ret += i;
     }

     return ret;

   }

   public static void main (String[] args) {
     // keep this function call here
     Scanner s = new Scanner(System.in);
     System.out.print(SimpleAdding(s.nextInt()));
   }

 }
