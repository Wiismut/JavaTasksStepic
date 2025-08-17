import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        File path = new File("input.txt");
        File path2 = new File("output.txt");
        PrintWriter pw = new PrintWriter(path2);
        Scanner sc = new Scanner(path);
        List<String> input = new ArrayList<>();

        while (sc.hasNext()) {
            input.add(sc.nextLine());
        }

        for(int i = 0; i < input.size(); i++) {
            String[] nums = input.get(i).split(" ");



            try {
                double a = Double.parseDouble(nums[0]);
                double b = Double.parseDouble(nums[2]);
            } catch (NumberFormatException e) {
                pw.println(input.get(i) + " = " + "Error! Not number");
                continue;
            }
            if (!nums[1].equals("/") && !nums[1].equals("*") && !nums[1].equals("+") && !nums[1].equals("-")) {
                pw.println(input.get(i) + " = " + "Operation Error!");
                continue;
            }

            if (nums[1].equals("/") && Double.parseDouble(nums[2]) == 0.0) {
                pw.println(input.get(i) + " = " + "Error! Division by zero");
                continue;
            }

            double result = arithmetic(nums[1], Double.parseDouble(nums[0]), Double.parseDouble(nums[2]));
            result = Math.round(result * 10.0) / 10.0;
            pw.println(input.get(i) + " = " +     String.valueOf(result));

        }
        pw.close();
        sc.close();

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
