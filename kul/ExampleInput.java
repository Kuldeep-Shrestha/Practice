import java.util.Scanner;
public class ExampleInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num1=sc.nextInt();
        System.out.println(num1);
        System.out.println("Enter the second num");
        int num2=sc.nextInt();
        System.out.println(num2);
        int sum=num1+num2;
        System.out.println(sum);
        sc.close();
    }
    
}
