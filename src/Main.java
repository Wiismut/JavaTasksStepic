import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        input = input.replace(" ", "");
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            int j = input.length() - 1 - i;
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
                }
        }

            System.out.println(isPalindrome ? "YES" : "NO");

    }
}