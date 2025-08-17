import java.util.Scanner;

public class simpleNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }


static void simple(int a){
    if (a < 2) {
        System.out.println("NO");
        return;
    }
    for (int i = 2; i * i <= a; i++) {
        if (a % i == 0) {
            System.out.println("NO");
            return;
        }
    }
    System.out.println("YES");

    }

}
