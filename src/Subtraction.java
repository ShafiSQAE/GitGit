import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num1, num2, sub;

        System.out.println("Enter the first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        num2=scanner.nextInt();

        sub=num1-num2;
        System.out.println("The sum is: "+sub);

    }
}
