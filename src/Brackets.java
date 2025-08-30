import java.util.Scanner;

public class Brackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String check;
        do {
            check = input;
            input = input.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
        } while (!input.equals(check));

        System.out.println(input.isEmpty());


    }
}
