import java.util.Scanner;

public class phaenon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        char[] ch = input.toCharArray();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (ch[i]){
                case '0':
                    counter++;
                    break;
                case '6':
                    counter++;
                    break;
                case '8':
                    counter+=2;
                    break;
                case '9':
                    counter++;
                    break;
            }

        }
        System.out.println(counter);


    }
}
