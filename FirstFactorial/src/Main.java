import java.util.Scanner;

/**
 *
 * Challenge
 * Have the function FirstFactorial(num) take the num parameter
 * being passed and return the factorial of it. For example: if
 * num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
 * For the test cases, the range will be between 1 and 18 and
 * the input will always be an integer.
 *
 * Sample Test Cases:
 *
 * Input:"4"
 * Output:"24"
 * Reasoning: 4 x 3 x 2 x 1 = 24
 *
 * Input:"1"
 * Output:"1"
 *
 *
 */
class Main {
    public static int FirstFactorial(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        if (num == 0 || num == 1) return 1;
        return FirstFactorial(num - 1) * num;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}
