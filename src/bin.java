import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        ArrayList<String> nums = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        boolean inNumber = false;
        StringBuilder currentNumber = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                    currentNumber.append(ch);
                    inNumber = true;
                } else {
                    if (inNumber) {
                        int decimal = Integer.parseInt(currentNumber.toString());
                        output.append(Integer.toBinaryString(decimal));
                        currentNumber.setLength(0);
                    }
                    output.append(ch);
                    inNumber = false;
                }
            }
        if (inNumber) {
            int decimal = Integer.parseInt(currentNumber.toString());
            output.append(Integer.toBinaryString(decimal));
        }
        System.out.println(output);

    }
}
