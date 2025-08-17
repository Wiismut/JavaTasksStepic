import java.util.Scanner;

public class funcLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);

    }
    static void monneub(int[] array){
        if (array.length == 0) {
            System.out.println(0);
            return;
        }
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i] >= array[i-1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        System.out.println(maxLength);
    }
}

