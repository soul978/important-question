import java.util.Scanner;

public class all_time_add_fun {
    @SuppressWarnings("resource")
    static void add_inputs(int a){
        Scanner shivam = new Scanner(System.in);
        int c = 2;
        int sum = 0;
        
            while(a!=0){
                sum+=a;
                System.out.print("Enter the "+c+" numbers : ");
                a = shivam.nextInt();
                c++;
            }
        System.out.println("The Resultant is : "+sum);
       
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Press 0 than answer you got ");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1 numbers : ");
        int numbers_1 = sc.nextInt();
        add_inputs(numbers_1);
    }
}
