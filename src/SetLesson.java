import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetLesson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Set<String> words= new HashSet<>();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            String[] word = str
                    .split("\\s+");
            for (String j : word) {
                if (!j.isEmpty()) {
                    words.add(j);
                }
            }
        }
        System.out.println(words.size());




    }
}
