import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num1, num2, sum;
        double avg;

        System.out.println("Enter the first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        num2=scanner.nextInt();

        sum=num1+num2;
        avg=(double) sum/2;
        System.out.println("The average is: "+avg);
    }
}
