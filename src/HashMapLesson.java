import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapLesson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> words = new HashMap<>();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String val = sc.nextLine();
            if(!words.containsKey(val)){
                words.put(val, 1);
            }
            else {
                words.put(val, words.get(val) + 1);
            }
        }
        int max = 0;
        String word = "";
        for(String i:words.keySet()){
            int count = words.get(i);
            if( count > max) {
                max = count;
                word = i;
            }
        }
        System.out.println(word);

    }
}
