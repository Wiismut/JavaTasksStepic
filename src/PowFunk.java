import java.util.Scanner;

public class PowFunk {

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
        int result = 1;
        for(int i = 0; i < n; i++){
            result *= a;
        }
        return result;

    }
}
