import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num1, num2, mul;

        System.out.println("Enter the first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        num2=scanner.nextInt();

        mul=num1+num2;
        System.out.println("The multiplication is: "+mul);
        System.out.println("The multiplication is only of Integer Numbers");
    }
}
