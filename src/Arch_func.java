import java.util.Scanner;

public class Arch_func {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F +"H");
    }

    static int arhimed(int ro,int V){
        return 10*ro*V;
    }
}
