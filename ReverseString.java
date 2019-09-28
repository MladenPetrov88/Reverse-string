import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        StringBuilder sb = new StringBuilder(input);
        sb = sb.reverse();

        System.out.println(sb);
    }
}
