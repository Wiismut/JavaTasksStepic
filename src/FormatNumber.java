import java.util.Scanner;

public class FormatNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        format_number(number);
    }
    static void format_number(String number){
        if(number.length() != 11){
            System.out.print("Неверное число символов");
            return;
        }
        for(int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            if(!Character.isDigit(ch)){
                System.out.print("Не все символы являются цифрами");
                return;
            }
        }
        if(!number.startsWith("8")){
            System.out.print("Это не российский номер телефона");
            return;
        }
        System.out.print(number.substring(0,1) + " (" + number.substring(1,4) + ") " + number.substring(4,7) + "-" + number.substring(7,9) + "-" + number.substring(9,11));



    }
}
