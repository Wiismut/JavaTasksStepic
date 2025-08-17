import java.util.Scanner;

public class recArray {
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
            int index = 0;
            int ans = find_line7(mas, index);
            if (ans != -1)
                System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
            else
                System.out.println("Таких строк нет");
        }

        static int find_line7(int[][] mas, int index){

            if (index >= mas.length) {
                return -1;
            }
            int sum = 0;
                for(int i = 0; i<mas[index].length;i++){
                    sum += mas[index][i];
                }
            if(sum % 7 == 0)
            {
                return index;
            }
            return find_line7(mas,index+1);
        }

}
