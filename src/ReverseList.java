import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        data.add("десять");
        data.add("девять");
        data.add("восемь");
        data.add("семь");
        data.add("шесть");
        data.add("пять");
        data.add("четыре");
        data.add("три");
        data.add("два");
        data.add("один");
        data.add("ноль");


        System.out.println(data);


        StringBuilder result = new StringBuilder();
        for(int i = data.size()-1; i >= 0; i--){
            result.append(data.get(i));
            if(i != 0){
                result.append(", ");
            }
        }
        System.out.println(result);


    }
}
