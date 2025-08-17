import java.util.Scanner;

public class funcLesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }




    static void perimeter(String figure, int x){
        if(figure.equals("Круг")){
            int result = (int) Math.ceil(2*Math.PI*x);
            System.out.println(result);
        }
        if(figure.equals("Квадрат")){
            System.out.println(4*x);
        }
    }
    static void area(String figure, int x){
        if(figure.equals("Круг")){
            int result = (int) Math.ceil(Math.PI*Math.pow(x,2));
            System.out.println(result);
        }
        if(figure.equals("Квадрат")){
            int result = (int) Math.ceil(Math.pow(x,2));
            System.out.println(result);
        }
    }

}
