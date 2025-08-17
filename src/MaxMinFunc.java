import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMinFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        maximin(mas);
    }

    static void maximin(int[][] arr){
        List<Integer> minList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if (arr[i].length == 0) continue;
            int min = arr[i][0];
            for(int j = 1; j < arr[i].length; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
            minList.add(min);
        }
        Collections.sort(minList);

        System.out.println(minList.get(minList.size()-1));
    }

}
