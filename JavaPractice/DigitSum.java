import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args)
    {
        try {
            String num = new Scanner(System.in).nextLine().trim().replace("-", "");
            if (num.length() > 10 || (Long.parseLong(num) != Long.parseLong(num))) {System.out.print("Error"); return;}
            System.out.print(digitSum(num));
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
    private static int digitSum(String s) {
        String num = s.replaceAll("0", "");
        return num.chars().mapToObj(Character::getNumericValue).reduce(0, (a, b) -> a + b);
    }
}