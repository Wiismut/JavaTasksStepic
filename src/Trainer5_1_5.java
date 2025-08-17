import java.util.Scanner;

public class Trainer5_1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] nums = input.toCharArray();
        boolean flag = false;
        for(int i = 0; i < nums.length;i++){
           if( sumArr(0, nums, i+1) == sumArr(i+1, nums, nums.length)){
               flag = true;
               break;
           }
            else{
               flag=false;
           }
        }
        System.out.println(flag);

    }


    static int sumArr(int index, char[] nums, int size){
        int sum = 0;
        for(int i = index; i < size; i++){
            sum += Integer.parseInt(String.valueOf(nums[i]));
        }
        return sum;
    }


}
