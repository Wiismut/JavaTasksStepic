import java.util.Scanner;

public class RecPowFunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
    static double pow(double a, int n){
        if(n==0){
            return 1;
        }
        if(n == 1) {
            return a;
        }
        if (n < 0) {
            return 1 / pow(a, -n);
        }
        if (n % 2 == 0) {
            double halfPow = pow(a, n / 2);
            return halfPow * halfPow;
        } else {
            return a * pow(a, n - 1);
        }

    }
}