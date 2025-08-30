import java.util.Scanner;

public class AliceandBobPlayingFlowerGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long x_count_even = n / 2;
        long x_count_odd = (n+1) / 2;
        long y_count_even = m / 2;
        long y_count_odd = (m+1) / 2;
        System.out.println(x_count_even*y_count_odd+y_count_even*x_count_odd);


    }

}
