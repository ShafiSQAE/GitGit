import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num1, num2, sum;

        System.out.println("Enter the first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        num2=scanner.nextInt();

        sum=num1+num2;
        System.out.println("The sum is: "+sum);
        System.out.println("The sum is only of Integer Numbers");
    }
}
