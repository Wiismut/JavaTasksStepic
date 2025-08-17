import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> queue = new ArrayList<>();
        String lastProcessed = null;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            if (str.startsWith("Добавить ")) {
                queue.add(str.substring(9));
                System.out.println(str.substring(9) + " в очереди");
            }
            else if (str.contains(" занимал за ") || str.contains(" занимала за ")) {
                String[] parts = str.split(" занимал[а]? за ");
                String name1 = parts[0];
                String name2 = parts[1];
                int index = queue.indexOf(name2);
                if (index != -1) {
                    queue.add(index + 1, name1);
                } else if (name2.equals(lastProcessed)) {
                    queue.add(0, name1);
                } else {
                    queue.add(name1);
                    System.out.println(name1 + ", не надо тут ля-ля");
                }
            }
            else if (str.equals("Следующий!")) {
                if (!queue.isEmpty()) {
                    String name = queue.remove(0);
                    lastProcessed = name;
                    System.out.println(name + " в обработке");
                } else {
                    System.out.println("Отлично, попью чаёк!");
                    lastProcessed = null;
                }
            }
            else if (str.equals("Посмотреть очередь")) {
                if(!queue.isEmpty()) {
                    System.out.println(String.join(" ", queue));
                }
                else{
                    System.out.println("*прокатилось перекати-поле*");
                }
            }
            else if (str.startsWith("Стоит ли оно того?")) {
                String name = str.substring(19);
                if(queue.size() < 5) {
                    queue.add(name);
                }
                else {
                    System.out.println("Слабак!");
                }
            }
        }


    }
}
