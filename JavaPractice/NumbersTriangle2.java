import java.util.stream.IntStream;
public class NumbersTriangle2 {
    public static void main(String args[]) {
        // add your code here
        IntStream.range(1, 8).forEach((i) -> {
            IntStream.range(0, i).forEach(d -> System.out.printf("%d", i));
            System.out.println();
        });
    }
}