import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondSmallest2 {
    public static void main(String[] args)
    {
        System.out.print("Enter N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] arr = new double[n];
        IntStream.iterate(0, i -> i < n, i -> i + 1).forEach(i -> arr[i] = input.nextDouble());
        System.out.print(Arrays.stream(arr).sorted().limit(2).reduce((a, b) -> b).getAsDouble());
    }
}