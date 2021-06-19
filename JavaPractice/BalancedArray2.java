import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class BalancedArray2 {
    public static void main(String[] args) {
        boolean canBeBalanced;
        try {
            List<Integer> arr = Arrays.stream(new Scanner(System.in).nextLine().trim().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            canBeBalanced = IntStream.rangeClosed(0, (int) arr.stream().count())
                    .map(i ->
                            IntStream.range(0, i).map(x -> (int) arr.stream().toArray()[x]).sum() -
                                    IntStream.range(i, arr.size()).map(x -> (int) arr.stream().toArray()[x]).sum())
                    .filter(n -> n >= 0).sorted().findFirst().getAsInt() == 0 ? true : false;
            System.out.print(String.format("Can %sbe balanced", (canBeBalanced ? "" : "not ")));
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
}