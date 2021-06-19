import java.util.stream.IntStream;
public class NestedNumbers2 {
    public static void main(String args[]) {
        // add your code here
        IntStream.range(0, 3).forEach((i) -> {
            IntStream.range(0, 10).forEach(d -> System.out.printf("%d%d%d", d, d, d));
            System.out.println();
        });
    }
}