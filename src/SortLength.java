import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortByLength(s);
    }


    static void sortByLength(String str){
        List<String> words = Arrays.asList(str.split(" "));

        // Сортируем, сохраняя порядок элементов с одинаковой длиной
        List<String> sorted = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(String.join(" ", sorted));

    }
    static void sortByLength1(String str){
        String[] parts = str.split(" ");
        String temp = "";
        for(int i = 0; i < parts.length;i++){
            for(int j = 0; j < parts.length-1-i;j++){
                if(parts[j].length() > parts[j+1].length()){
                    temp = parts[j];
                    parts[j] = parts[j+1];
                    parts[j+1] = temp;
                }
            }
        }
        for(int i = 0; i< parts.length; i++) {
            System.out.print(parts[i] + " ");
        }
    }

}
