/**
 *
 * Challenge
 * Have the function KaprekarsConstant(num) take the num parameter being passed which will be a 4-digit number with at least two distinct digits. Your program should perform the following routine on the number: Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number), and subtract the smaller number from the bigger number. Then repeat the previous step. Performing this routine will always cause you to reach a fixed number: 6174. Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174). Your program should return the number of times this routine must be performed until 6174 is reached. For example: if num is 3524 your program should return 3 because of the following steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174.
 *
 * Sample Test Cases:
 *
 * Input: 2111
 * Output: 5
 *
 * Input: 9831
 * Output: 7
 *
 */

 import java.util.*;
 import java.io.*;

 class Main {
   static int steps = 0;
   public static int KaprekarsConstant(int num) {

     // code goes here
     /* Note: In Java the return type of a function and the
        parameter types being passed are defined, so this return
        call must match the return type of the function.
        You are free to modify the return type. */
     String paddedNum = padToFour(num);
     if (paddedNum.equals("6174")) {
       return steps;
     } else {
       //arrange in decreasing order
       int descNum = arrangeNum(paddedNum, false);
       //arrange in ascending order
       int ascNum = arrangeNum(paddedNum, true);
       steps++;
       int difference = subtract(ascNum, descNum);
       return KaprekarsConstant(difference);
     }
   }

   public static String padToFour(int num) {
     return String.format("%0"+4+"d", num);
   }

   public static int arrangeNum(String numStr, boolean asc) {
     ArrayList<Integer> asciiNums = new ArrayList<>();
     for (int i = 0; i < numStr.length(); i++) {
       int val = (int)numStr.charAt(i);
       asciiNums.add(val);
     }
     StringBuilder newNumStr = new StringBuilder();
     if (asc) {
       Collections.sort(asciiNums);
     } else {
       Collections.sort(asciiNums, Collections.reverseOrder());
     }
     for (int val: asciiNums) {
       newNumStr.append((char) val);
     }
     return Integer.valueOf(newNumStr.toString());
   }

   public static int subtract(int ascNum, int descNum) {
     if (ascNum > descNum) {
       return ascNum - descNum;
     } else {
       return descNum - ascNum;
     }
   }

   public static void main (String[] args) {
     // keep this function call here
     Scanner s = new Scanner(System.in);
     System.out.print(KaprekarsConstant(s.nextInt()));
   }

 }
