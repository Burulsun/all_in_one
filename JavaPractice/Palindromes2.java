import java.util.Scanner;
import java.util.stream.IntStream;
public class Palindromes2 {
    public static void main(String args[]){
        // add your code here
        System.out.print("Enter a number: ");
        int d = new Scanner(System.in).nextInt();
        System.out.print("This number is " + (isPalindrome2(d) ? "" : "not ") + "a palindrome");
    }

    private static boolean isPalindrome2(int d) {
        return d == IntStream.iterate(d, n -> n != 0, k -> k / 10)
                .map(n -> n % 10).reduce(0, (a, b) -> a * 10 + b);
    }
}