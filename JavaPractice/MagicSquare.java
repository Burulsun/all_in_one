import java.util.Scanner;
import java.util.stream.IntStream;

public class MagicSquare {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(), cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        IntStream.range(0, rows).forEach(i -> IntStream.range(0, cols).forEach(j -> arr[i][j] = input.nextInt()));
        System.out.print(isMagicSquare(arr));
    }
    private static boolean isMagicSquare(int[][] arr) {
        if (arr[0].length != arr.length) return false;
        int magicNum = IntStream.of(arr[0]).sum();
        int d = arr.length;
        return IntStream.range(1, d).map(i -> IntStream.of(arr[i]).sum()).allMatch(num -> num == magicNum) &&
                IntStream.range(0, d).map(j -> IntStream.range(0, d).map(i -> arr[i][j]).sum()).allMatch(num -> num == magicNum) &&
                IntStream.range(0, d).map(i -> arr[i][i]).sum() == magicNum &&
                IntStream.range(0, d).map(i -> arr[i][d - i - 1]).sum() == magicNum;
    }
}