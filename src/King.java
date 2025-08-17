import java.util.Scanner;

public class King {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        king_step(x1, y1, x2, y2);
    }

    private static void king_step(int x1, int y1, int x2, int y2){
    if(x1 > 8 || y1>8  || x1 <= 0 || y1 <= 0 ){
        System.out.print("1");
        return;
    }
    if(x2 > 8 || y2>8 || x2 <= 0 || y2 <= 0 ){
        System.out.print("2");
        return;
    }
    if (x1 == x2 && y1==y2){
        System.out.print("3");
        return;
    }
    boolean flag = false;
    if(x2==x1-1 && y2==y1 || x2==x1-1 && y2==y1+1 || x2==x1 && y2==y1+1 || x2==x1+1 && y2==y1+1 || x2==x1+1 && y2==y1
            || x2==x1+1 && y2==y1-1   || x2==x1 && y2==y1-1 || x2==x1-1 && y2==y1-1 ){
        flag = true;
    }
    System.out.print(flag ? "YES" : "NO" );


    }


}
