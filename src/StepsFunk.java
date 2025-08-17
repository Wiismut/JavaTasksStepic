import java.util.HashMap;
import java.util.Scanner;

public class StepsFunk {

    static HashMap<Integer, Integer> cash;

    public static void main(String[] args) {
        cash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cash.put(1, 1);
        cash.put(2, 2);
        cash.put(3, 4);
        System.out.println(trib(n));
    }

    static int trib(int n){
        if (n==0){
            return 1;
        }
        if (!cash.containsKey(n)){
            cash.put(n, trib(n-1) + trib(n-2) + trib(n-3));
        }
        return cash.get(n);
    }
}