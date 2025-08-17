import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Coordinates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] coord = new double[n][2];
        for (int i = 0; i < n; i++) {
            coord[i][0] = sc.nextDouble();
            coord[i][1] = sc.nextDouble();
        }

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(area(coord)));
        System.out.println(df.format(perimeter(coord)));

    }

    private static double area(double[][] coord) {
        double sum1 = 0;
        double sum2 = 0;
        int n = coord.length;
        for (int i = 0; i < n; i++) {
            int index = (i + 1) % n;
            sum1 += coord[i][0] * coord[index][1];
            sum2 += coord[i][1] * coord[index][0];
        }
        double result = Math.abs(sum1 - sum2) / 2;
        return result;
    }

    private static double perimeter(double[][] coord) {
    double sum = 0;
    int n = coord.length;
    for(int i = 0; i < n;i++){
        double[] index = coord[(i + 1) % n];
        sum += Math.sqrt( Math.pow(index[0]-coord[i][0],2) + Math.pow(index[1]-coord[i][1],2));
    }
        return sum;
    }
}
