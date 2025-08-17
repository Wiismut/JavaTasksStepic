import java.util.Scanner;

public class ReverseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for(int i: mas)
            System.out.print(i + " ");
    }

    static int[] sort(int[] mas){
        int n = mas.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1- i; j++){
                if(mas[j] < mas[j+1]){
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
return mas;


    }

}
