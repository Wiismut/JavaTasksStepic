import java.util.Scanner;

public class AkkerFunk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(akkerman(m, n));
    }


    private static int akkerman(int m, int n){
        int result = 0;
        if(m==0){
            result = n+1;
        }
        if(m>0 && n == 0){
            result = akkerman(m-1,1);
        }
        if(m>0 && n>0){
            result = akkerman(m-1,akkerman(m,n-1));
        }
        return result;


    }


}
