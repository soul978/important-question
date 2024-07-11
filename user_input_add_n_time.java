import java.util.Scanner;

public class user_input_add_n_time {
@SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num!= -1){
            sum+=num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
    
}