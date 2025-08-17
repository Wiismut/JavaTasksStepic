import java.io.File;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        File path = new File("input.txt");

        Scanner sc = new Scanner(path);
        String input = sc.nextLine();
        String[] nums = input.split(" ");

        try {
            double a = Double.parseDouble(nums[0]);
            double b = Double.parseDouble(nums[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
            return;
        }

        if(!nums[1].equals("/") && !nums[1].equals("*") && !nums[1].equals("+") && !nums[1].equals("-")){
            throw new Exception("Operation Error!");
        }

        if(nums[1].equals("/") && Double.parseDouble(nums[2]) == 0.0 ){
            throw new Exception("Error! Division by zero");
        }

        double result = arithmetic(nums[1],Double.parseDouble(nums[0]),Double.parseDouble(nums[2]));
        result = Math.round(result * 10.0) / 10.0;
        System.out.println(result);
    }

    static double arithmetic(String operation, double num1, double num2) throws Exception {
        if(operation.equals("+")){
            return num1+num2;
        }
        if(operation.equals("-")){
            return num1-num2;
        }
        if(operation.equals("*")){
            return num1*num2;
        }
        else {
            return num1 / num2;
        }
    }


}
