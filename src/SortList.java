import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);

        List<String> data = new ArrayList<>();
        data.add("буря");
        data.add("море");
        data.add("небо");
        data.add("кгуде");
        data.add("где");
        //String order = sc.nextLine();
        String order = "DESC";
        List<String> result = customSort(data, order);
        System.out.println(result);

    }


    public static List<String> customSort(List<String> data, String order) {
    if(order.equals("ASC")){
        System.out.println("Сортировка по порядку");
        for(int i = 0; i < data.size(); i++){
            char[] arr = data.get(i).toCharArray();
            String word =  new String(sotrArrASC(arr));
            data.set(i, word);
        }
        return data;
    } else if (order.equals("DESC")){
        System.out.println("Сортировка НЕ по порядку");
        for(int i = 0; i < data.size(); i++){

            char[] arr = data.get(i).toCharArray();
            String word =  new String(sotrArrDESC(arr));
            data.set(i, word);
        }
        return data;
    }
        return data;
    }

    public static char[] sotrArrASC(char[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static char[] sotrArrDESC(char[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }



}
