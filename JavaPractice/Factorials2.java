import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorials2 {
    public static void main(String[] args) {
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        if (n < 0) System.out.println(" Incorrect input!");
        else {
            System.out.printf("\nX    X!\n");
            IntStream.rangeClosed(0, n).forEach(d -> System.out.printf("%-4d %d\n", d, factorialOfN(d)));
        }

    }

    private static long factorialOfN(int n) {
        return n != 0 ? IntStream.rangeClosed(1, n).reduce((x, y) -> x * y).getAsInt() : 1;
    }
}