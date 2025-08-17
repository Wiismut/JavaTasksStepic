import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> nums = new ArrayList<>();
        for(int i = 0; i<n; i++){
            nums.add(String.valueOf(i+1));
        }

        int k = sc.nextInt();
        for(int i = 0; i<k; i++){
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            nums.add(val2, String.valueOf(val1));
        }
        System.out.println(String.join(" ", nums));
    }
}
