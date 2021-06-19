import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.stream.IntStream;

public class Primes2 {
    public static void main(String[] args)
    {
        // write your code here
        System.out.print(IntStream.rangeClosed(2, new Scanner(System.in).nextInt()).filter(Primes2::isPrime)
                .mapToObj(String::valueOf).collect(Collectors.joining(" ")));

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag ? true : false;
    }
}