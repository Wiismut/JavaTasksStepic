import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trainer7_1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < height; i ++) {
            List<Integer> row = new ArrayList<>();
            int center = height-1;
            for (int j = 0; j < (height * 2 - 1); j++) {

                if (j >= center - i && j <= center + i) {
                    row.add(1);
                } else {
                    row.add(0);
                }
        }
            result.add(row);
        }
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }


}
