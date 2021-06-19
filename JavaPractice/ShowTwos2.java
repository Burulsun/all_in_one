import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class ShowTwos2 {
    public static void main(String[] args) {
        // write your code here
        System.out.print(showTwos(new Scanner(System.in).nextInt()));
    }

    public static String showTwos(int number){
        String res = String.format("%d = ", number);
        if (number % 2 == 1) return res + number;
        int two_count = Arrays.stream(new StringBuilder(Integer.toBinaryString(number))
                .reverse().toString().split("1")).findFirst().get().length();
        return Stream.iterate(res, s -> "" + "2 * ").limit(two_count + 1).collect(Collectors.joining())
                + (int) (number / Math.pow(2, two_count));
    }
}