import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class simpleNum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }
    static void simpleAB(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i == 1) {
                System.out.println("1 - 1");
            } else {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i + " - простое");
                } else {
                    System.out.println(i + " - составное");
                }
            }
        }
    }


}
