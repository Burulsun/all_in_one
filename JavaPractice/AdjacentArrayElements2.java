import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class AdjacentArrayElements2 {
    public static void main(String[] args) {
        try {
            List<Integer> arr = Arrays.stream(new Scanner(System.in).nextLine()
                    .trim().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            if (arr.size() != 10) { System.out.print("Error"); return;}
            System.out.print(IntStream.rangeClosed(0, 8).map(x -> arr.get(x) == arr.get(x+1) ? 1 : 0)
                    .mapToObj(String::valueOf).collect(Collectors.joining())
                    .replaceAll("11", "1").replaceAll("11", "1")
                    .replaceAll("11", "1").replaceAll("11", "1")
                    .chars().filter(chr -> chr == '1').count());
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
}